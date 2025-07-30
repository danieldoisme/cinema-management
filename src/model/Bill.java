package model;

import java.sql.Timestamp;
import java.util.List;

public class Bill {

    private int id;
    private Timestamp creationDate;

    private Employee employee;

    private List<Ticket> tickets;
    private List<UsedService> usedServices;

    public Bill() {
    }

    public Bill(int id, Timestamp creationDate, Employee employee, List<Ticket> tickets, List<UsedService> usedServices) {
        this.id = id;
        this.creationDate = creationDate;
        this.employee = employee;
        this.tickets = tickets;
        this.usedServices = usedServices;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public List<UsedService> getUsedServices() {
        return usedServices;
    }

    public void setUsedServices(List<UsedService> usedServices) {
        this.usedServices = usedServices;
    }
}
