package Lab3;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Student Information
        System.out.print("Matric Number: ");
        int matricNumber= input.nextInt();
        System.out.print("Enter mark for Assessment 1: ");
        double assessment1 = input.nextDouble();
        System.out.print("Enter mark for Assessment 2: ");
        double assessment2 = input.nextDouble();
        System.out.print("Enter mark for Lab Assignment: ");
        double labAssignment = input.nextDouble();
        System.out.print("Enter your Final Exam mark: ");
        double finalExam = input.nextDouble();

        // Calculate total mark according to percentage
        double finalAssessment1 = assessment1 * 0.15;
        double finalAssessment2 = assessment2 * 0.20;
        double finalLabAssignment = labAssignment * 0.35;
        double finalExamMark = finalExam * 0.30;
        double totalMark = finalAssessment1 + finalAssessment2 + finalLabAssignment + finalExamMark;

        //Display total mark
        System.out.println("Your total mark for CCS3100 (" + finalAssessment1 + " + " + finalAssessment2 + " + " + finalLabAssignment + " + " + finalExamMark + ") is " + totalMark);
        input.close();
    }
}
    
