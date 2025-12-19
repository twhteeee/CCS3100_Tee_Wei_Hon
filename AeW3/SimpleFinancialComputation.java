import java.util.Scanner;

public class SimpleFinancialComputation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Price of item and quantity
        System.out.print("Enter the price of item: RM ");
        double price = input.nextDouble();
        System.out.print("Enter the quantity of item: ");
        int quantity = input.nextInt();

        // Calculate total price
        double total = price * quantity;

        //6% SST
        double sst = total * 0.06;

        // Amount paid
        System.out.print("Amount paid: RM ");
        double paid = input.nextDouble();

        // Calculate change
        double change = paid - total - sst;

        // Display total price and change
        System.out.println(); // Blank line for better readability
        System.out.println("Purchase Summary");
        System.out.println("----------------");
        System.out.println("Subtotal: RM " + String.format("%.2f", total));
        System.out.println("SST (6%): RM " + String.format("%.2f", sst));
        System.out.println("Total Amount: RM " + String.format("%.2f", (total + sst)));
        System.out.println("Change: RM " + String.format("%.2f", change));
        input.close();  
    }
}
