package Week7;

public class CharacterConversion {
    public static void main(String[] args) {
        char c = 'X';
        String s = String.valueOf(c);
        System.out.println("Char: " + c);
        System.out.println("String: " + s);

        char a = 'A';
        char b = 'B';
        String single = String.valueOf(a) + String.valueOf(b);
        System.out.println("Char: "  + a + b);
        System.out.println("String: " + single);
    }
    
}
