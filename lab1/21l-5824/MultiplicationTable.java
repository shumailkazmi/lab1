import java.util.Scanner;
public class MultiplicationTable
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ENTER number = ");
        int number = scanner.nextInt();
        
        System.out.println("table of " + number + " is \n");
        
        for (int i = 1; i <= 10; i++) {
            int res = number * i;
            System.out.println(number + " x " + i + " = " + res);
        }
        
        scanner.close();
    }
}
