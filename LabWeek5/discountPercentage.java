package LabWeek5;

import java.util.Scanner;

public class discountPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter quantity of items purchased: ");
        int quantity = input.nextInt();
        double discount;

        if (quantity > 5) {
            discount = 0.50;
        }
        else if (quantity >= 4) {
            discount = 0.20;
        }
        else if (quantity >= 2) {
            discount = 0.10;
        }
        else {
            discount = 0.0;
        }

        // Display the discount percentage
        if (quantity >= 1) {
            System.out.printf("Discount: %.0f%%\n", (discount * 100));
        }
        else {
            System.out.println("No item has been purchased.");
        }

        input.close();
    }  
}
