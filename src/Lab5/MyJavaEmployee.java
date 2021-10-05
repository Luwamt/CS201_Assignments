package Lab5;

import java.util.Scanner;

public class MyJavaEmployee {
    private static final double HOURLY_RATE = 7.25;
    private static final int REGULAR_HRS = 40;
    private static final double COMMISSION_PERCENTAGE1 = 0.05;
    private static final double COMMISSION_PERCENTAGE2 = 0.1;
    private static final double COMMISSION_PERCENTAGE3 = 0.15;
    private static final double EXTRA_TIME_WAGES = 1.5 * HOURLY_RATE; //(HOURLY_RATE + (HOURLY_RATE / 2)


    public static double totalWages( int numberHRS, double totalSales) {
        double wages;
        int extraHRS = numberHRS - REGULAR_HRS;
        if (numberHRS <= REGULAR_HRS) {
            wages = HOURLY_RATE * REGULAR_HRS;
        } else {
            wages = (HOURLY_RATE * REGULAR_HRS) + (extraHRS * EXTRA_TIME_WAGES);
        }
        if (totalSales >= 1 && totalSales <= 99.99) {
            wages = wages + (totalSales * COMMISSION_PERCENTAGE1);
        } else if (totalSales >= 100 && totalSales <= 299.99) {
            wages = wages + (totalSales * COMMISSION_PERCENTAGE2);
        } else {
            wages = wages + (totalSales * COMMISSION_PERCENTAGE3);
        }
        return wages;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number HRS  you worked");
        int noHRS = input.nextInt();
        System.out.println("Please enter total sales");
        double totalSales = input.nextDouble();
        double result = MyJavaEmployee.totalWages(noHRS, totalSales);
        System.out.println("Your total sales is: $"+totalSales+"\nThe total hours you worked is: "+noHRS+"\nYour total wages is: $" + result);

    }

    }

