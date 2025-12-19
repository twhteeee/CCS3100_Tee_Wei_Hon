import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        /*Average of three integers */
        System.out.println("Enter three integers to calculate their average.");
        Scanner input = new Scanner(System.in);
        System.out.print("List of three integers: ");
        int int1 = input.nextInt(); // First integer
        int int2 = input.nextInt(); // Second integer
        int int3 = input.nextInt(); // Third integer
        double averageInt = (int1 + int2 + int3) / 3.0;
        System.out.println("The average of the three integers is: " + averageInt); // Display average of integers
        System.out.println(); // Blank line for readability

        /*Final sale price calculation */
        System.out.println("Enter the original price and discount percentage to calculate the final sale price.");
        System.out.print("Sale price of an item in original price(RM): ");
        double originalPrice = input.nextDouble(); // Original price of item
        System.out.print("Discount percentage(%): ");
        double discountpercentage = input.nextDouble(); // Discount percentage
        double finalPrice = originalPrice * (100 - discountpercentage) / 100;
        System.out.println("Final sale price after discount: RM " + finalPrice); // Display final sale price
        System.out.println(); // Blank line for readability

        /*Pounds to kilograms*/ 
        System.out.println("Pounds to kilograms converter.");
        System.out.print("Enter weight in pounds: ");
        double Pounds = input.nextDouble(); // Weight in pounds
        double kg = Pounds * 0.45359;
        System.out.println("Weight in kg: " + kg ); // Display weight in kg 
        System.out.println(); // Blank line for readability

        /*Calculate BMI */
        System.out.println("BMI calculator");
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble(); // Weight in kg
        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble(); // Height in meters
        double BMI = weight / (height * height);
        System.out.println("Your BMI: " + BMI); // Display BMI
        input.close();
    }
}
