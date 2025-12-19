public class DataTypesConversion {
    public static void main(String[] args) {
        int num = 10;
        double converted = num; // Implicit 
        double d = 9.87;
        int i =  (int) d; // Explicit (casting)
        System.out.println("Convert integer to double = " + converted);
        System.out.println("Convert double to integer = " + i);
    }
}
