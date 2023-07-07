package model.parking;

import model.payment.Payment;

import java.sql.Timestamp;

public class ParkingTicket {
    private int ticketNo;
    private Timestamp timeStamp;
    private Timestamp exit;
    private Double amount;
    private Payment payment;

}
