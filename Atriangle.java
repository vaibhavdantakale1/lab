public class Atriangle {
    public static void main(String[] args) {
        int numRows = 5; // Change this value to adjust the number of rows in the triangle
        for (int i = numRows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
