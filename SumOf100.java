public class SumOf100 {
    public static void main(String[] args) {
        int number = 1;
        int total = 0;
        System.out.print(number + " + ");
        while (number < 99) {
            total = total + number;
            number++;
            System.out.print(number + " + ");
        }
        while (number == 99) {
            total = total + number;
            number++;
            System.out.print(number + " = ");
        }
        System.out.print(total);
    }
    
}
