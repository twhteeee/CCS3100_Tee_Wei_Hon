package Week9;

public class DoWhileLoop {
    public static void main(String[] args) {
        int number = 1;

        System.out.print("Odd number = ");
        do {
            System.out.print(number + " ");
            number += 2;
        } while (number < 10);
    }
    
}
