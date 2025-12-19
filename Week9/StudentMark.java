package Week9;

import java.util.Scanner;

public class StudentMark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStd = input.nextInt();

        double mark = 0.0;
        double total = 0.0;

        for (int i = 1; i <= numStd; i++) {
            System.out.println("For student " + i + " :");
            for (int subject = 1; subject <= 3; subject++) {
                System.out.print("Enter mark for subject " + subject + ": ");
                mark = input.nextDouble();
                total += mark;
            }
            System.out.println("\nTotal mark for student " + i + " = " + total);
        }
        input.close();
    }
    
}
