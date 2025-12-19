package Week9;

public class StarPattern {
    public static void main(String[] args) {
        int rows = 1;

        while (rows <= 5) {
            int star = 1;
            while (star <= rows) {
                System.out.print("*");
                star++;
            }
            System.out.println();
            rows++;
        }
    }
}