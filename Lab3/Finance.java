package Lab3;

import java.util.Scanner;

public class Finance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Read subtotal and gratuity rate
        System.out.print("Enter the subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        //Calculate gratuity and total
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        //Display results
        System.out.println("The gratuity is $ " + gratuity + " and the total is $ " + total);
        input.close();
    }
    
}
