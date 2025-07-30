package model;

import java.sql.Date;
import java.sql.Time;

public class Showtime {

    private int id;
    private Date showDate;
    private Time showTime;
    private double ticketPrice;

    private Movie movie;
    private ScreenRoom screenRoom;

    public Showtime() {
    }

    public Showtime(int id, Date showDate, Time showTime, double ticketPrice, Movie movie, ScreenRoom screenRoom) {
        this.id = id;
        this.showDate = showDate;
        this.showTime = showTime;
        this.ticketPrice = ticketPrice;
        this.movie = movie;
        this.screenRoom = screenRoom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getShowDate() {
        return showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    public Time getShowTime() {
        return showTime;
    }

    public void setShowTime(Time showTime) {
        this.showTime = showTime;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public ScreenRoom getScreenRoom() {
        return screenRoom;
    }

    public void setScreenRoom(ScreenRoom screenRoom) {
        this.screenRoom = screenRoom;
    }
}
