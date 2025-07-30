package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Movie;
import model.ScreenRoom;
import model.Showtime;

public class ShowtimeDAO extends DAO {

    public ShowtimeDAO() {
        super();
    }

    public ArrayList<Showtime> searchShowtimesByMovie(int movieID) {
        ArrayList<Showtime> result = new ArrayList<>();
        String sql = "SELECT st.ID, st.showDate, st.showTime, st.ticketPrice, "
                + "m.ID as movieID, m.title, "
                + "sr.ID as screenRoomID, sr.roomCode "
                + "FROM tblShowtime st "
                + "JOIN tblMovie m ON st.movieID = m.ID "
                + "JOIN tblScreenRoom sr ON st.screenRoomID = sr.ID "
                + "WHERE st.movieID = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, movieID);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Movie movie = new Movie();
                movie.setId(rs.getInt("movieID"));
                movie.setTitle(rs.getString("title"));

                ScreenRoom screenRoom = new ScreenRoom();
                screenRoom.setId(rs.getInt("screenRoomID"));
                screenRoom.setRoomCode(rs.getString("roomCode"));

                Showtime showtime = new Showtime();
                showtime.setId(rs.getInt("ID"));
                showtime.setShowDate(rs.getDate("showDate"));
                showtime.setShowTime(rs.getTime("showTime"));
                showtime.setTicketPrice(rs.getDouble("ticketPrice"));
                showtime.setMovie(movie);
                showtime.setScreenRoom(screenRoom);

                result.add(showtime);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
