import java.util.Scanner;

public class Numberche {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println(num + " is negative");
        } else if (num == 0) {
            System.out.println(num + " is zero");
        } else {
            System.out.println(num + " is positive");
        }
    }
}
