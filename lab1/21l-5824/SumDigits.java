import java.util.Scanner;
public class SumDigits
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter number b/w 0 - 1000: ");
        int number = scanner.nextInt();
        if (number < 0 || number > 1000) {
            System.out.println("invalid");
        } else {
            int sum = 0;
            int originalNumber = number;
            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            System.out.println("sum of " + originalNumber + " = " + sum);
        }

        scanner.close();
    }
}
