package day03;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private List<Double> prices = new ArrayList<>();

    public Stock(List<Double> prices) {
        this.prices = prices;
    }

    public double maxProfit() {
        //min vizsgálat
        double min = prices.get(0);
        for (int i = 1; i < prices.size(); i++) {
            if (min > prices.get(i)) {
                min = prices.get(i);
            }
        }
        int sizeMin = prices.indexOf(min);

        //max vizsgálat
        double max = prices.get(sizeMin);
        for (int i = sizeMin; i < prices.size(); i++) {
            if (max < prices.get(i)) {
                max = prices.get(i);
            }
        }
        return max - min;
    }
}
