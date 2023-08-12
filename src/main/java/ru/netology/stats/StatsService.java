package ru.netology.stats;
public class StatsService {
    public long sum(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int montMaximum(long[] sales) {
        int montMaximumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[montMaximumSale]) {
                montMaximumSale = i;
            }
        }
        return montMaximumSale + 1;
    }

    public int montMinimum(long[] sales) {
        int montMinimumSaleSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[montMinimumSaleSale]) {
                montMinimumSaleSale = i;
            }
        }
        return montMinimumSaleSale + 1;
    }

    public int monthBellowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }


}
