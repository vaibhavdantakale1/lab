import java.util.Scanner;

public class Cubenumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println(i + "^3 = " + cube);
        }
    }
}
