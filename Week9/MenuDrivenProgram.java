package Week9;

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Add two numbers");
            System.out.println("2. Multiply two numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = input.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter two numbers to add: ");
                    double num1 = input.nextDouble();
                    double num2 = input.nextDouble();
                    double sum = num1 + num2;
                    System.out.println("Addition of two numbers entered is " + sum);
            break;
                case 2:
                    System.out.print("Enter two numbers to multiply: ");
                    double num3 = input.nextDouble();
                    double num4 = input.nextDouble();
                    double product = num3 * num4;
                    System.out.println("Multiplication of two numbers entered is " + product);
            break;
                case 3:
                    System.out.println("You have chosen to exit the program, Goodbye!");
            break;
                default:
                    System.out.println("Invalid choice! Please select a valid option (1-3).");
            }
        } while (choice != 3);
        input.close();
    }
    
}
