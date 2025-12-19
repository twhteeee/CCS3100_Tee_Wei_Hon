import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        int total = 0;

        total =+ integer;

         while (integer != 0) {
            System.out.print("Enter an integer: ");
            integer = input.nextInt();
            total += integer;
    }
    input.close();
    System.out.println("Total: " + total);
    }
}