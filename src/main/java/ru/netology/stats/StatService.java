package ru.netology.stats;

public class StatService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long averageSale(long[] sales) {
        return sum(sales) / 12;
    }

    public int monthMaximumSale(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[month] <= sales[i]) {
                month = i;
            }

        }
        return month + 1;
    }

    public int monthMinimumSale(long[] sales) {
        int month = 0;
        for (int i = 0; i > sales.length; i++) {
            if (sales[month] >= sales[i]) {
                month = i;
            }

        }
        return month + 1;
    }

    public int monthBelowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale(sales)) {
                counter++;
            }
        }
        return counter;
    }
}