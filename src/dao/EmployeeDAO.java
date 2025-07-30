package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Employee;

public class EmployeeDAO extends DAO {

    public EmployeeDAO() {
        super();
    }

    public Employee checkLogin(int employeeID) {
        Employee employee = null;
        String sql = "SELECT * FROM tblEmployee WHERE ID = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, employeeID);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                employee = new Employee();
                employee.setId(rs.getInt("ID"));
                employee.setFullName(rs.getString("fullName"));
                employee.setPosition(rs.getString("position"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee;
    }
}
