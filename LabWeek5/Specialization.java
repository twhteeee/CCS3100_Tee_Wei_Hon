package LabWeek5;

import java.util.Scanner;

public class Specialization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the code of the specialization: ");
        int code = input.nextInt();

        String specialization = "Unknown";

        if (code == 480) {
            specialization = "Multimedia";
        }
        else if (code == 481) {
            specialization = "Computer System";
        }
        else if (code == 482) {
            specialization = "Software Engineering";
        }
        else if (code ==  483) {
            specialization = "Computer Network";
        }
        else {
            specialization = "Code not found!!!";
        }

        //Display specialization
        if (code >= 480 && code <= 483) {
            System.out.println("The specialization is: " + specialization);
        }
        else {
            System.out.println(specialization);
        }
        input.close();
    }
}
