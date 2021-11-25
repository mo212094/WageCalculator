package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name:");
        String employeeName = input.nextLine();
        System.out.println("Enter number of hours");
        int numOfHours = input.nextInt();
        System.out.println("Enter hourly wage:");
        int hourlyWage = input.nextInt();

        int moneyOwed = numOfHours * hourlyWage;


        if (numOfHours > 45) {
            int overHours = numOfHours - 45;
            double overPay = overHours * 1.5;
            double overTax = (moneyOwed + overPay) * 0.2;
            System.out.println(employeeName + " \nTax Deducted: £" + overTax + "\nPay: £" + (moneyOwed + overPay - overTax) );
        }else {
            double tax = moneyOwed * 0.2;
            System.out.println( employeeName + " \nTax Deducted: £" + tax + "\nPay: £" + (moneyOwed - tax) );
        }

    }
}