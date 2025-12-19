public class DataTypesDemo {
    public static void main(String[] args) {
       int age = 20;
       double height = 1.70;
       char grade = 'A';
       boolean isStudent = true;
       String name = "Aisha";
         System.out.println("Name: " + name); 
         System.out.println("Age: " + age);
         System.out.println("Height: " + height + "m");
         System.out.println("Grade: " + grade);
         System.out.println("Is Student: " + isStudent);

         //Demostrating constant
         System.out.println();
          final double PI = 3.14159; 
          // double PI = 4.14159; This will cause a compilation error
          System.out.println("Value of PI: " + PI);

    }
}
