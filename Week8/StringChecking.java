package Week8;

//Tee Wei Hon
//230773
//Bachelor of Software Engineering with Honours
//Lab 5 - String

import java.util.Scanner;

public class StringChecking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = input.nextLine();
        if (first.length() >= 10) {
            String substring = first.substring(4, 10);
            System.out.println("Substring from 5 to 10 : " + substring);
        }
        else {
            System.out.println("String length less than 10.");
        }

        System.out.print("\nEnter second string: ");
        String second = input.nextLine();
        if (first.contains(second)) {
            String replace = first.replace(second, "-replaced-");
            System.out.println("Second string exists in first string.");
            System.out.println("\nNew first string: " + replace);
        }
        else {
            System.out.println("Second string does not exist in first string.");
        }
        input.close();
    }
    
}
