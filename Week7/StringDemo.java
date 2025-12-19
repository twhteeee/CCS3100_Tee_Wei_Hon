package Week7;

public class StringDemo {
    public static void main(String[] args) {
        String name = "Tee Wei Hon";

        System.out.println("Length: " + name.length());
        System.out.println("First char: " + name.charAt(0));
        System.out.println("Substring: " + name.substring(0,4));
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Compare: " + name.equals("Tee Wei Hon"));
    }
    
}
