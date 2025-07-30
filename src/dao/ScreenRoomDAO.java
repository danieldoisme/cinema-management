package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.ScreenRoom;
import model.Cinema;

public class ScreenRoomDAO extends DAO {

    public ScreenRoomDAO() {
        super();
    }

    public ArrayList<ScreenRoom> listScreenRooms() {
        ArrayList<ScreenRoom> result = new ArrayList<>();
        String sql = "SELECT * FROM tblScreenRoom";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ScreenRoom sr = new ScreenRoom();
                sr.setId(rs.getInt("ID"));
                sr.setRoomCode(rs.getString("roomCode"));
                sr.setSeatCount(rs.getInt("seatCount"));
                sr.setType(rs.getString("type"));

                // CinemaDAO cDAO = new CinemaDAO();
                // Cinema cinema = cDAO.getCinemaByID(rs.getInt("cinemaID"));
                // sr.setCinema(cinema);
                result.add(sr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
