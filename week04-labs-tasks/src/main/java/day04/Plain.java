package day04;

import java.util.ArrayList;
import java.util.List;

public class Plain {
    private int maxCapacity = 3; //utasok max száma
    private List<Passenger> passList = new ArrayList<>();

    public boolean addPassanger(Passenger passenger) {
        if (maxCapacity > passList.size()) {
            passList.add(passenger);
            return true;
        }
        return false;
    }

    public  int numberOfPackages() {
        int packNum = 0;
        for (Passenger p: passList) {
            packNum += p.getPackNum();
        } return packNum;
    }
}
