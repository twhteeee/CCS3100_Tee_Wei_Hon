public class OperationsDemo {
    public static void main(String[] args) {
        int x = 10 , y = 3;
        System.out.println("x + y = " + (x + y)); // Addition
        System.out.println("x - y: = " + (x - y)); // Subtraction
        System.out.println("x * y = " + (x * y)); // Multiplication
        System.out.println("x / y = " + ((double) x / y)); // Division
        System.out.println("x % y = " + (x % y)); // Remainder
        System.out.println("x > y? " + (x > y)); // Greater than
        System.out.println("x < y? " + (x < y)); // Less than
        System.out.println("x == y? " + (x == y)); // Equal to
        System.out.println("x != y? " + (x != y)); // Not equal to
        System.out.println("x > y && x < y? " + (x > y && x < y)); // Logical AND
        System.out.println("x > y || x < y? " + (x > y || x < y)); // Logical OR
        System.out.println("!(x > y)? " + !(x > y)); // Logical NOT
    }
}
