package Week9;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNum = 67;
        int guess;

        do {
            System.out.print("Guess a number between 1 - 100: ");
            guess = input.nextInt();
            if (guess < secretNum) {
                System.out.println("Too low and try again.");
            }
            else if (guess > secretNum) {
                System.out.println("Too high and please try again.");
            }
            else {
                System.out.println("Congratulations!!! You got it correct!");
            }
        } while (guess != secretNum);
        input.close();
    }
    
}
