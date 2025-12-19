import java.util.Scanner;

public class TuitionFees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         //Students information
         System.out.print("Code Program: ");
         String code = input.nextLine();
         System.out.print("Semester No: ");
         int semester = input.nextInt();
         System.out.print("Credit Hours Registered: ");
         int credit = input.nextInt();

         double semFees = 0.0, creditFees = 0.0, totalFees;
         String programName = "Unknown";

        //Determine tuition fees based on code program and semester no
        switch (code) {
            case "MCS" : programName = "Master of Computer Science";
                if (semester == 1) {
                    semFees = 1250.0;
                    creditFees = 250.0;
                }
                else {
                    semFees = 1000.0;
                    creditFees = 250.0;
                }
            break;
            case "ME" : programName = "Master of Environment";
                if (semester ==1) {
                    semFees = 1400.0;
                    creditFees = 250.0;
                }
                else {
                    semFees = 1100.0;
                    creditFees = 250.0;
                }
            break;
            case "MPM" : programName = "Master in Plantation Management";
                if(semester == 1) {
                    semFees = 1250.0;
                    creditFees = 275.0;
                }
                else {
                    semFees = 1000.0;
                    creditFees = 275.0;
                }
            break;
            case "MEOH" : programName = "Master of Environmental and Occupational Health";
                if (semester == 1)  {
                    semFees = 1250.0;
                    creditFees = 350.0;
                }
                else {
                    semFees = 1000.0;
                    creditFees = 350.0;
                }
            break;
            default: 
                programName = "Code program not found!!!";
        }

        //Tuition fees calculation
        totalFees = semFees + (creditFees * credit);

        //Display total fees
        switch (code) {
            case "MCS" : 
            case "ME" :
            case "MPM" : 
            case "MEOH" :
                System.out.println("\n--------------------------------------------");
                System.out.println("\nMaster Program: " + programName);
                System.out.println("Semester No: " + semester);
                System.out.println("Credit Hours: " + credit);
                System.out.println("Total Tuition Fees: RM " + String.format("%.2f", totalFees));
            break;
            default : 
                System.out.println("\n--------------------------------------------");
                System.out.println(programName);
        }
        input.close();

    }
}
