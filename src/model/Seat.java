package model;

public class Seat {

    private int id;
    private String seatRow;
    private int seatNumber;
    private String type;
    private String status;

    private ScreenRoom screenRoom;

    public Seat() {
    }

    public Seat(int id, String seatRow, int seatNumber, String type, String status, ScreenRoom screenRoom) {
        this.id = id;
        this.seatRow = seatRow;
        this.seatNumber = seatNumber;
        this.type = type;
        this.status = status;
        this.screenRoom = screenRoom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(String seatRow) {
        this.seatRow = seatRow;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ScreenRoom getScreenRoom() {
        return screenRoom;
    }

    public void setScreenRoom(ScreenRoom screenRoom) {
        this.screenRoom = screenRoom;
    }

}
