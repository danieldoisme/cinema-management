package model;

public class UsedService {

    private int id;
    private int amount;
    private double price;
    private float discount;

    private Bill bill;

    private Service service;

    public UsedService() {
    }

    public UsedService(int id, int amount, double price, float discount, Bill bill, Service service) {
        this.id = id;
        this.amount = amount;
        this.price = price;
        this.discount = discount;
        this.bill = bill;
        this.service = service;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
