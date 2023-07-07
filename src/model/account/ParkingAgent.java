package model.account;

public class ParkingAgent extends Account {


    public boolean processTicket() {
        return true;
    }

    @Override
    public boolean resetPassword() {
        return false;
    }
}
