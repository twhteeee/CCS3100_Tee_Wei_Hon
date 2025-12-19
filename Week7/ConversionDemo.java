package Week7;

public class ConversionDemo {
    public static void main(String[] args) {
        char c = 'Z';
        char d = 'A';
        char e = 'C';
        char f = 'K';
        String s = String.valueOf(c) + String.valueOf(d) + String.valueOf(e) + String.valueOf(f);
        char first = s.charAt(1);

        System.out.println("String: " + s);
        System.out.println("Char: " + first);
    }
    
}
