package LabWeek5;

import java.util.Scanner;

public class switchSpecialization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the code of the specialization: ");
        int code = input.nextInt();

        String specialization = "unknown";

        switch (code) {
            case 480 : specialization = "Multimedia";
        break;
            case 481 : specialization = "Computer System";
        break;
            case 482 : specialization = "Software Engineering";
        break;
            case 483 : specialization = "Computer Network";
        break;
            default : specialization = "Code not found!!!";
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
