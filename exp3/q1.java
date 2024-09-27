 import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = calculateSum(n);
        System.out.println("Sum of the first " + n + " natural numbers: " + sum);
    }

    public static int calculateSum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + calculateSum(num - 1);
        }
    }
}
