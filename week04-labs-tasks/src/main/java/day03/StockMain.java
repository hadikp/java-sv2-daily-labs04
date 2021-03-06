package day03;

import java.util.Arrays;
import java.util.Scanner;

public class StockMain {
    public static void main(String[] args) {

        Stock stock = new Stock(Arrays.asList(1.23,4.35,0.23,4.0,8.4));
        System.out.println(stock.maxProfit());  //8.17


        Stock stock2 = new Stock(Arrays.asList(12.0,2.0,8.0,4.0));
        stock2.maxProfit();
        System.out.println(stock2.maxProfit()); //6.0
    }

}
