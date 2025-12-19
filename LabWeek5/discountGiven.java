package LabWeek5;

import java.util.Scanner;

public class discountGiven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price per item: RM ");
        double pricePerItem = input.nextDouble();
        System.out.print("Enter the number of items bought: ");
        int number = input.nextInt();

        double discount = 0.0, finalPrice;

        double price = pricePerItem * number;

        if (price > 100) {
            if (number >= 1000) {
                discount = 0.43;
            }
            else if (number >= 500) {
                discount = 0.32;
            }
            else if (number >= 100) {
                discount = 0.21;
            }
            else if (number >= 10) {
                discount = 0.09;
            }
            else if (number >= 1) {
                discount = 0.05;
            }
        }
        else if (price > 10) {
            if (number >= 1000) {
                discount = 0.32;
            }
            else if (number >= 500) {
                discount = 0.23;
            }
            else if (number >= 100) {
                discount = 0.15;
            }
            else if (number >= 10) {
                discount = 0.07;
            }
            else if (number >= 1) {
                discount = 0.02;
            }
        }
        else {
            if (number >= 1000) {
                discount = 0.21;
            }
            else if (number >= 500) {
                discount = 0.14;
            }
            else if (number >=100) {
                discount = 0.09;
            }
            else if (number >= 10) {
                discount = 0.05;
            }
            else if (number >= 1) {
                discount = 0.0;
            }
        }

        if (number > 0) {
            finalPrice = price * (1 - discount);
            System.out.println();
            System.out.println("********************************************");
            System.out.println("Purchase summary");
            System.out.println("Price per item: RM " + String.format("%.2f", pricePerItem));
            System.out.println("Quantity: " + number);
            System.out.println("Subtotal: RM " + String.format("%.2f",price));
            System.out.println("Discount: " + String.format("%.0f",(discount * 100)) + "%");
            System.out.println("Final Price: RM " + String.format("%.2f",finalPrice));
        }
        else {
            System.out.println("No item has been perchased");
        }

        input.close();
    }
    
}
