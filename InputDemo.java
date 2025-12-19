import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: " ); // User name
        String name = input.nextLine();
        System.out.print("Enter your age: "); // User age
        int age = input.nextInt();
        System.out.println("Hello " + name + ", you are " + age + " years old.");
        System.out.println(); // Blank line for better readability

        // Sum and Average of two numbers
        System.out.print("Enter two numbers to get the sum and average: ");
        double num1 = input.nextDouble(); // First number
        double num2 = input.nextDouble(); // Second number
        double sum = num1 + num2;
        System.out.println("The sum of your numbers is: " + sum);
        double average = (num1 + num2) / 2;
        System.out.println("The average of your numbers is: " + average);
        input.close();
       }
}
