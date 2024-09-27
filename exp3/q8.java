import java.util.Scanner;

public class q8 {

    // Recursive method to convert decimal to hexadecimal
    public static String decimalToHex(int decimal) {
        if (decimal == 0) {
            return "";
        }
        int remainder = decimal % 16;
        char hexChar = (remainder < 10) ? (char) (remainder + '0') : (char) (remainder - 10 + 'A');
        return decimalToHex(decimal / 16) + hexChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String hex = decimalToHex(decimal);
        System.out.println("Hexadecimal: " + (hex.isEmpty() ? "0" : hex));
        scanner.close();
    }
}
