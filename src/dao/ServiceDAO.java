package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Service;

public class ServiceDAO extends DAO {

    public ServiceDAO() {
        super();
    }

    public ArrayList<Service> listServices() {
        ArrayList<Service> result = new ArrayList<>();
        String sql = "SELECT * FROM tblService";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Service service = new Service();
                service.setId(rs.getInt("ID"));
                service.setName(rs.getString("name"));
                service.setServicePrice(rs.getDouble("servicePrice"));
                result.add(service);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
