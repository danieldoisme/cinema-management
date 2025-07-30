package dao;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import model.Bill;
import model.Ticket;
import model.UsedService;

public class BillDAO extends DAO {

    public BillDAO() {
        super();
    }

    public boolean addBill(Bill bill) {
        String sqlAddBill = "INSERT INTO tblBill(creationDate, employeeID) VALUES(?,?)";
        String sqlAddTicket = "INSERT INTO tblTicket(price, discount, billID, showtimeID, seatID) VALUES(?,?,?,?,?)";
        String sqlAddUsedService = "INSERT INTO tblUsedService(amount, price, discount, billID, serviceID) VALUES(?,?,?,?,?)";
        boolean result = false;

        try {
            con.setAutoCommit(false);

            PreparedStatement psBill = con.prepareStatement(sqlAddBill, Statement.RETURN_GENERATED_KEYS);
            psBill.setTimestamp(1, bill.getCreationDate());
            psBill.setInt(2, bill.getEmployee().getId());
            psBill.executeUpdate();

            ResultSet generatedKeys = psBill.getGeneratedKeys();
            if (generatedKeys.next()) {
                bill.setId(generatedKeys.getInt(1));
            }

            for (Ticket ticket : bill.getTickets()) {
                PreparedStatement psTicket = con.prepareStatement(sqlAddTicket);
                psTicket.setDouble(1, ticket.getPrice());
                psTicket.setFloat(2, ticket.getDiscount());
                psTicket.setInt(3, bill.getId());
                psTicket.setInt(4, ticket.getShowtime().getId());
                psTicket.setInt(5, ticket.getSeat().getId());
                psTicket.executeUpdate();
            }

            if (bill.getUsedServices() != null) {
                for (UsedService usedService : bill.getUsedServices()) {
                    PreparedStatement psService = con.prepareStatement(sqlAddUsedService);
                    psService.setInt(1, usedService.getAmount());
                    psService.setDouble(2, usedService.getPrice());
                    psService.setFloat(3, usedService.getDiscount());
                    psService.setInt(4, bill.getId());
                    psService.setInt(5, usedService.getService().getId());
                    psService.executeUpdate();
                }
            }

            con.commit();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            try {
                con.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                con.setAutoCommit(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }
}
