package model;

public class ScreenRoom {

    private int id;
    private String roomCode;
    private int seatCount;
    private String type;

    private Cinema cinema;

    public ScreenRoom() {
    }

    public ScreenRoom(int id, String roomCode, int seatCount, String type, Cinema cinema) {
        this.id = id;
        this.roomCode = roomCode;
        this.seatCount = seatCount;
        this.type = type;
        this.cinema = cinema;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

}
