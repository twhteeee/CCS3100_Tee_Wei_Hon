package Week9;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0;
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to " + number + " is " + sum);
        input.close();
    }
    
}
