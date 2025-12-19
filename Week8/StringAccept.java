package Week8;

//Tee Wei Hon
//230773
//Bachelor of Software Engineering with Honours
//Lab 5 - String

import java.util.Scanner;
public class StringAccept {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = input.nextLine();
        
        while (first.length() <=8) {
            System.out.println("Invalid password");
            System.out.println("\nThe password must be more than 8 characters.");
            System.out.print("Enter first string: ");
            first = input.nextLine();
        }

         System.out.println("Valid password");

        System.out.print("\nEnter second string: ");
        String second = input.nextLine();
        String SECOND = second.toUpperCase();

        System.out.println("\nNew string: " + SECOND + " " + first);
        input.close();
    }
}
