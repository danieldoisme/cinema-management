package model;

public class Employee {

    private int id;
    private String fullName;
    private String position;

    public Employee() {
    }

    public Employee(int id, String fullName, String position) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
