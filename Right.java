public class Right {
    public static void main(String[] args) {
        int numRows = 4; // Change this value to adjust the number of rows in the triangle
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
