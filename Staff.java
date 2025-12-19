import java.util.Scanner;

public class Staff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Code: ");
        String code =  sc.next();

        switch (code) {
            case "D12": 
                System.out.println("Lecturer");
        break;
            case "D13":
                System.out.println("Senior Lecturer");
        break;
            case "D14":
                System.out.println("Associate Professor");
        break;
            case "D15":
                System.out.println("Professor");
        break;
            default: 
                System.out.println("Code unknown");
        }
        sc.close();
    }
    
}
