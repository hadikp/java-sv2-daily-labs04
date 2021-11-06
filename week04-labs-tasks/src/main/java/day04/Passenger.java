package day04;

public class Passenger {
    private String name;
    private String ticketAzon;
    private int packNum;

    public Passenger(String name, String ticketAzon, int packNum) {
        this.name = name;
        this.ticketAzon = ticketAzon;
        this.packNum = packNum;
    }

    public int getPackNum() {
        return packNum;
    }
}
