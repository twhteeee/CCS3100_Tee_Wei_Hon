import java.util.Scanner;

public class MyWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your work experience: ");
        int experience = input.nextInt();

        int status = 0;

        if ((age > 25) && (experience > 5)) {
            status = 2;
        }
        else if (experience > 5) {
            status = 1;
        }
        else {
            status =0;
        }
        System.out.println("Status: " + status);

        if (status == 2) {
            System.out.println("Call for interview");
        }
        else if (status == 1) {
            System.out.println("Add to kiv list");
        }
        else {
            System.out.println("Add to rejected list");
        }
        input.close();
    }
    
}
