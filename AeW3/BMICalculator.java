import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // User input weight and height
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble(); 
        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble(); 

        // Calculate BMI
        double bmi = weight / (height * height);

        // Display BMI
        System.out.println("Your BMI is: " + bmi);
        input.close();
        }
}