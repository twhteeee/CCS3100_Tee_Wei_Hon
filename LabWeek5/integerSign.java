package LabWeek5;

import java.util.Scanner;

public class integerSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        if (integer == 0) {
            System.out.println("0 is not a positive or negative integer.");
        }
        else if (integer > 0) {
            System.out.println("positive");
        }
        else {
            System.out.println("negative");
        }
        input.close();
    }
    
}
