import java.util.Scanner;

public class AlgorithmPorgramConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length(cm): ");
        double length = input.nextDouble(); // Length of rectangle
        System.out.print("Enter the width(cm): "); 
        double width = input.nextDouble(); // Width of rectangle

        // Calculate perimeter and area
        double perimeter = 2 * (length + width);
        double area = length * width;
        // Display the perimeter and area
        System.out.println("The perimeter of the rectangle: " + perimeter + " cm");
        System.out.println("The area of the rectangle: " + area + " cm²");
        input.close();

    }
    
}
