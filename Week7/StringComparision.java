package Week7;

public class StringComparision {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "hello";

        System.out.println(a.equals(b)); // false
        System.out.println(a.equalsIgnoreCase(b)); // true

        String c = "JAVA";
        String d = "java";
        System.out.println(c.equals(d)); // false
        System.out.println(c.equalsIgnoreCase(d)); // true
    }
    
}
