import java.util.Scanner;

public class q7 {

    static int findMissingNumber(int[] arr, int left, int right) {
        if (left > right) { 
            return 1;
        }
        int mid = left + (right - left) / 2;

        if (arr[mid] == mid + 1) {
            return findMissingNumber(arr, mid + 1, right);
        } else {
            return findMissingNumber(arr, left, mid);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = findMissingNumber(arr, 0, n - 1);
        System.out.println("The smallest positive missing number is: " + result);

        scanner.close();
    }
}