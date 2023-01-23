package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     *
     * Takes the owned amount
     * finds the 10% of that amount
     * subtract it from the owned amount
     * repeat the process 3 times
     * 
     * @param amount owned
     * @return amount owned after 3 months
     */
    static int getRemainingAmountIn3Months(int amount) {

        for(int i=0; i<3; i++) {
            int percent = (int)(amount * (10.0f / 100.0f));
            amount-=percent;
        }

        return amount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
