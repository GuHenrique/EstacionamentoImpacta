package model.account;

public class Admin extends Account{


    public boolean addParkingSpot(int floorName, int spot){
        return true;
    }

    public boolean addDisplayBoard(int floorName, String displayBoard){
        return true;
    }

    public boolean addEntrance(String entrance){
        return true;
    }

    public boolean addExit(String exit){
        return true;
    }


    @Override
    public boolean resetPassword() {
        return false;
    }
}
