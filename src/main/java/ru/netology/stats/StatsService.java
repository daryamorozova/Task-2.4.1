package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] purchases) {
        int amountofsum = 0;

        for (int item : purchases) {
            amountofsum = amountofsum + item;

        }

        return amountofsum;

    }

    public int calculateAverageSum(int[] purchases) {
        int amountofsum = calculateSum(purchases);
        int numbermonth = 0;
        for (int purchase : purchases) {
            numbermonth = numbermonth + 1;
        }
        int averagesum = amountofsum / numbermonth;

        return averagesum;
    }


    public int calculateIndexMaxsales(int[] purchases) {
        int IndexMaxsales = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] >= purchases[IndexMaxsales]) {
                IndexMaxsales = i;
            }
        }

        return IndexMaxsales + 1;
    }

    public int calculateIndexMinsales(int[] purchases) {
        int IndexMinsales = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] < purchases[IndexMinsales]) {
                IndexMinsales = i;
            }
        }

        return IndexMinsales + 1;
    }

    public int calculateSaleUnderAverageSum(int[] purchases) {
        int averagesum = calculateAverageSum(purchases);
        int AmountMonth = 0;

        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] < averagesum) {
                AmountMonth = AmountMonth + 1;
            }
        }

        return AmountMonth;
    }

    public int calculateSaleOverAverageSum(int[] purchases) {
        int averagesum = calculateAverageSum(purchases);
        int AmountMonth = 0;

        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] > averagesum) {
                AmountMonth = AmountMonth + 1;
            }
        }

        return AmountMonth;
    }
}