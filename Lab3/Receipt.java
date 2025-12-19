package Lab3;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Item 1 Information
        System.out.print("Item 1: ");
        String item1 = input.nextLine();
        System.out.print("Quantity: ");
        int quantity1 = input.nextInt();
        System.out.print("Unit Price: RM ");
        double price1 = input.nextDouble();

        // Item 2 Information
        System.out.print("Item 2: ");
        String item2 = input.next();
        System.out.print("Quantity: ");
        int quantity2 = input.nextInt();
        System.out.print("Unit Price: RM ");
        double price2 = input.nextDouble();
        System.out.println(); // Blank line for readability

        // Amount for item 1 and item 2
        double amount1 = quantity1 * price1;
        double amount2 = quantity2 * price2;

        // Subtotal, government tax, service charge and total
        double subtotal = amount1 + amount2;
        double gst = 0.06 * subtotal;
        double serviceCharge = 0.10 * subtotal;
        double total = subtotal + gst + serviceCharge;

        // Display receipt
        System.out.println("Item 1: " + item1);
        System.out.println("Quantity: " + quantity1);
        System.out.println("Unit Price: RM " + String.format("%.2f", price1));
        System.out.println("Amount: RM " + String.format("%.2f", amount1));
        System.out.println("***************************");
        System.out.println("Item 2: " + item2);
        System.out.println("Quantity: " + quantity2);
        System.out.println("Unit Price: RM " + String.format("%.2f", price2));
        System.out.println("Amount: RM " + String.format("%.2f", amount2));
        System.out.println(); // Blank line for readability
        System.out.println("Subtotal: RM " + String.format("%.2f", (subtotal)));
        System.out.println("Government Tax: RM " + String.format("%.2f", gst));
        System.out.println("Service Charge: RM " + String.format("%.2f", serviceCharge));
        System.out.println(); // Blank line for readability
        System.out.println("Total: RM " + String.format("%.2f", total));
        input.close();
    }
}
