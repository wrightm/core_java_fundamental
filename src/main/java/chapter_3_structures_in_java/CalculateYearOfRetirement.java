package chapter_3_structures_in_java;

import java.util.Scanner;

/**
 * Created by wrightm on 07/09/2014.
 */
public class CalculateYearOfRetirement {
    public static void main(String[] args)
    {
        // read inputs
        Scanner in = new Scanner(System.in);

        System.out.print("How much money do you need to retire? ");
        double goal = in.nextDouble();

        System.out.print("How much money will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        // update account balance while goal isn't reached
        do
        {
            // add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        } while(balance <= goal);

        String message = String.format("You can retire in %d years with %f", years, balance);
        System.out.println(message);
    }
}
