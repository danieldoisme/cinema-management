package model;

public class Ticket {

    private int id;
    private double price;
    private float discount;

    private Showtime showtime;
    private Seat seat;

    public Ticket() {
    }

    public Ticket(int id, double price, float discount, Showtime showtime, Seat seat) {
        this.id = id;
        this.price = price;
        this.discount = discount;
        this.showtime = showtime;
        this.seat = seat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Showtime getShowtime() {
        return showtime;
    }

    public void setShowtime(Showtime showtime) {
        this.showtime = showtime;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

}
