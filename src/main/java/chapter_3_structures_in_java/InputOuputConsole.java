package chapter_3_structures_in_java;

import java.util.Scanner;

/**
 * Created by wrightm on 07/09/2014.
 */
public class InputOuputConsole {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // get first input
        System.out.print("What is your name? ");
        String name = in.nextLine();

        // get second input
        System.out.print("How old are you? ");
        int age = in.nextInt();

        // display output on console
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
    }
}
