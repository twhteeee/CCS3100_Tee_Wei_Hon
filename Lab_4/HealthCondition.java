import java.util.Scanner;

public class HealthCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Read gender, weight, height and waist size
        System.out.print("Enter your gender (M/F): ");
        String gender = input.next();
        System.out.print("Enter your weight (kg): ");
        double weight = input.nextDouble();
        System.out.print("Enter your height (m): ");
        double height = input.nextDouble();
        System.out.print("Enter your waist size (inches): ");
        double waist = input.nextDouble();

        //Calculate BMI
        double bmi = weight / (height * height);

        String bmiCategory = "", risk;

        //Determine bmi category
        if (bmi >= 35) {
            bmiCategory = "Serverely Obese";
        }
        else if (bmi >= 30) {
            bmiCategory = "Obese";
        }
        else if (bmi >= 25) {
            bmiCategory = "Overweight";
        }
        else if (bmi>= 18) {
            bmiCategory = "Normal";
        }
        else {
            bmiCategory = "Underweight";
        }

        //Determine risk based on gender and waist size
        if (gender.equals("M")) {
            if (waist > 40) {
                risk = "High risk for heart disease and type 2 diabetes.";
            }
            else {
                risk = "Low risk for heart disease and type 2 diabetes.";
            }
        }
        else {
            if (waist > 35) {
                risk = "High risk for heart disease and type 2 diabetes.";
            }
            else {
                risk = "Low risk for heart disease and type 2 diabetes.";
            }
        }

        //Display results
        System.out.println("\n***************BMI Information***************");
        System.out.println("Your BMI: " + String.format("%.2f",bmi) + " (" + bmiCategory + ")");
        System.out.println("\n***************Risk Information***************");
        System.out.println("Gender: " + gender);
        System.out.println("Waist Size: " + waist + " inches");
        System.out.println(risk);

        input.close();
    }
}
    
