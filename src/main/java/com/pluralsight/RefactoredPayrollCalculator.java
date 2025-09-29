package com.pluralsight;

import java.util.Scanner;

public class RefactoredPayrollCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String name = getName();
        float hoursWorked = getHoursWorked();
        float payrate = getPayRate();
        getGrossPay(name, hoursWorked, payrate);
    }
        public static String getName() {
            System.out.println("What's your name?");
            String name = scanner.nextLine();
            return name;
        }
        public static float getHoursWorked() {
            System.out.println("How many hours have you worked?");
            float hoursworked = scanner.nextFloat();
            scanner.nextLine();
            return hoursworked;
        }

        public static float getPayRate() {
            System.out.println("What is your pay rate per hour?");
            float payrate = scanner.nextFloat();
            scanner.nextLine();
            return payrate;
        }

        public static void getGrossPay(String name, float hoursworked, float payrate) {
            float grosspay = hoursworked * payrate;
            System.out.println(name + "'s" + " " + "grosspay is" + " " + "$" + grosspay);
    }
    }
