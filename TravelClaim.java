import java.util.Scanner;

public class TravelClaim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Trip Distance (km): ");
        double distance = input.nextDouble();
        System.out.print("Enter Vehicle's engine size (cc): ");
        int engineSize = input.nextInt();

        double beyond, mileageRate, beyondMileageRate, totalMileageClaim;

        if (distance > 500) {
             beyond = distance - 500;
        } 
        else {
            beyond = 0;
        }

        if (engineSize < 2001) {
            if (beyond == 0) {
                mileageRate = 0.70;
                beyondMileageRate = 0.00;
            }
            else {
                mileageRate = 0.70;
                beyondMileageRate = 0.50;
            }
        }
        else {
            if (beyond == 0) {
                mileageRate = 0.80;
                beyondMileageRate = 0.00;
            }
            else {
                mileageRate = 0.80;
                beyondMileageRate = 0.60;
            }
        }

        if (beyond == 0) {
            totalMileageClaim = distance * mileageRate;
        }
        else {
            totalMileageClaim = (500 * mileageRate) + (beyond * beyondMileageRate);
        }
        System.out.printf("Total Mileage Claim: RM %.2f", totalMileageClaim);
        input.close();
    }
}
        



    
