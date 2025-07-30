package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Seat;

public class SeatDAO extends DAO {

    public SeatDAO() {
        super();
    }

    public ArrayList<Seat> getSeatsByShowtime(int screenRoomID, int showtimeID) {
        ArrayList<Seat> result = new ArrayList<>();
        String sql = "SELECT s.ID, s.seatRow, s.seatNumber, s.type, "
                + "CASE WHEN t.ID IS NULL THEN 'available' ELSE 'taken' END as status "
                + "FROM tblSeat s "
                + "LEFT JOIN tblTicket t ON s.ID = t.seatID AND t.showtimeID = ? "
                + "WHERE s.screenRoomID = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, showtimeID);
            ps.setInt(2, screenRoomID);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Seat seat = new Seat();
                seat.setId(rs.getInt("ID"));
                seat.setSeatRow(rs.getString("seatRow"));
                seat.setSeatNumber(rs.getInt("seatNumber"));
                seat.setType(rs.getString("type"));
                seat.setStatus(rs.getString("status"));

                result.add(seat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
