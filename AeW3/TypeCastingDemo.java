public class TypeCastingDemo{
    public static void main(String[] args) {
        int x = 10;
        double y = x; // Implicit conversion
        System.out.println("Implicit conversion (int to double): " + y);

        double pi = 3.14159;
        int intPi = (int) pi; // Explicit conversion
        System.out.println("Explicit conversion (double to int): " + intPi);

        char letter = 'A';
        int ascii = (int) letter;
        System.out.println("ASCII value of A: " + ascii);
    }
    
}
