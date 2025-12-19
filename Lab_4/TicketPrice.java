import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // User input for age and theme park type
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Select a park type: ");
        System.out.print("\n1. Theme Park\n2. Water Park\n3. Both parks\n Select from (1 - 3): ");
        int parkType = input.nextInt();

        double ticketPrice = 0.0;

        // Determine ticket price based on age and park type
            if (age >= 55) {
                if (parkType == 1) {
                    ticketPrice = 10.0;
                }
                else if (parkType == 2) {
                    ticketPrice = 15.0;
                }
                else {
                    ticketPrice = 20.0;
                }
            }
            else if (age >= 21) {
                if (parkType == 1) {
                    ticketPrice = 25.0;
                }
                else if (parkType == 2) {
                    ticketPrice = 30.0;
                }
                else {
                    ticketPrice = 45.0;
                }
            }
            else if (age >= 13) {
                if (parkType == 1) {
                    ticketPrice = 20.0;
                }
                else if (parkType == 2) {
                    ticketPrice = 25.0;
                }
                else {
                    ticketPrice = 40.0;
                }
            }
            else if (age >= 3) {
                if (parkType == 1) {
                    ticketPrice = 10.0;
                }
                else if (parkType == 2) {
                    ticketPrice = 15.0;
                }
                else {
                    ticketPrice = 20.0;
                }
            }
            else {
                if (parkType == 1) {
                    ticketPrice = 0.0;
                }
                else if (parkType == 2) {
                    ticketPrice = 7.0;
                }
                else {
                    ticketPrice = 5.0;
                }
            }

        // Display user information and ticket price
        System.out.println("\n----- Ticket Information -----");
        System.out.println("Age: " + age);
        System.out.println("Park Type: " + (parkType == 1 ? "Theme Park" : parkType == 2 ? "Water Park" : "Both Parks"));
        System.out.printf("Ticket Price: RM %.2f", ticketPrice);
        input.close();
    }
}