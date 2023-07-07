package model.parking;

public class ParkingLot {
    private int id;
    private String name;
    private Address address;

    public boolean addEntrance() {
        return false;
    }

    public boolean addExit() {
        return false;
    }

    public ParkingTicket getParkingTicket() {
        return new ParkingTicket();
    }

    public boolean isFull() {
        return false;
    }
}

