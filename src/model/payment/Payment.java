package model.payment;

import java.sql.Timestamp;

public abstract class Payment {

    private Double amount;
    private PaymentStatus status;
    private Timestamp timestamp;

    public abstract void calculate();


}
