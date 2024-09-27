import java.util.Scanner;

public class q2 {

    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        } else {
            int maxRest = findMax(arr, index + 1);
            return Math.max(arr[index], maxRest);
        }
    }

    // Recursive method to find the minimum value
    public static int findMin(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        } else {
            int minRest = findMin(arr, index + 1);
            return Math.min(arr[index], minRest);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = findMax(numbers, 0);
        int min = findMin(numbers, 0);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        scanner.close();
    }
}