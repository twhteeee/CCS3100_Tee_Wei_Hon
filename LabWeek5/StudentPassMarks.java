package LabWeek5;

import java.util.Scanner;

public class StudentPassMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the mark of the test: ");
        int mark = input.nextInt();

        if (mark > 40) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        input.close();
    }  
}
