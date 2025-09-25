package com.pluralsight;

import java.util.Scanner;

public class IfStatementTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("How many hours have you worked?");
        float hoursworked = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("What is your pay rate per hour?");
        float payrate = scanner.nextFloat();
        scanner.nextLine();
        double overtimepay = 0;
        if (hoursworked >= 40) {
           overtimepay = (hoursworked - 40) * 1.5 * payrate;
        }
        double grosspay = hoursworked * payrate + overtimepay;
        System.out.println(name + "'s" + " " + "grosspay is" + " " + "$" + grosspay);
    }
}
