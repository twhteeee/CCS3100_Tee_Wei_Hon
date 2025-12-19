import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Celsius to Fahrenheit
        System.out.println("Enter temperature in Celsius to convert to Fahrenheit.");
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble(); // Temperature in Celsius
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C = " + fahrenheit + "°F"); // Display result

        // Fahrenheit to Celsius
        System.out.println("Enter temperature in Fahrenheit to convert to Celsius:");
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble(); // Temperature in Fahrenheit
        celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + "°F = " + celsius + "°C"); // Display result

        // Celsius to Kelvin
        System.out.println("Enter temperature in Celsius to convert to Kelvin:");
        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble(); // Temperature in Celsius
        double kelvin = celsius + 273.15;
        System.out.println(celsius + "°C = " + kelvin + "K"); // Display result
        input.close();
    } 
}
