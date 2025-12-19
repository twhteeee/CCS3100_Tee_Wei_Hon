package Week9;

import java.util.Scanner;

public class PositiveNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number;
        do {
            System.out.print("Enter a positive number: ");
            number = input.nextDouble();
            if (number < 0) {
                System.out.println("Invalid input!! Please enter a positive number.");
            }
        } while (number <= 0);
        System.out.println("You have entered a positive number which is " + number);
        input.close();
    }
    
}
