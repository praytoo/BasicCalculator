package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
   public static void main(String [] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the first number");
       int firstnr = Integer.parseInt(scanner.nextLine());
       System.out.println("Enter the second number");
       int secondnr = Integer.parseInt(scanner.nextLine());
       System.out.println("Possible calculations + - * / Please select an option");
       String operator = scanner.nextLine();
       int result = firstnr * secondnr;
       System.out.println(firstnr + operator + secondnr + "=" + result);

    }
}
