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
        String sql = "SELECT sr.ID, sr.roomCode, sr.seatCount, sr.type, c.ID as cinemaID, c.name as cinemaName "
                + "FROM tblScreenRoom sr "
                + "JOIN tblCinema c ON sr.cinemaID = c.ID";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ScreenRoom sr = new ScreenRoom();
                sr.setId(rs.getInt("ID"));
                sr.setRoomCode(rs.getString("roomCode"));
                sr.setSeatCount(rs.getInt("seatCount"));
                sr.setType(rs.getString("type"));

                Cinema cinema = new Cinema();
                cinema.setId(rs.getInt("cinemaID"));
                cinema.setName(rs.getString("cinemaName"));
                sr.setCinema(cinema);

                result.add(sr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
