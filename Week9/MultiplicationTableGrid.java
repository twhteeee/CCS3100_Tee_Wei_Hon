package Week9;

public class MultiplicationTableGrid {
    public static void main(String[] args) {
        int rows, cols;

        for (rows = 1; rows <= 10; rows ++) {
            for (cols = 1; cols <=10; cols++) {
                System.out.print(rows * cols + "\t");
            }
            System.out.println();
        }
    }
}