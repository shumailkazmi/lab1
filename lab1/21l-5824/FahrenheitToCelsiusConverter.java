import java.util.Scanner;
public class FahrenheitToCelsiusConverter 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter temperature in fahrenheit =");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " degree Fahrenheit = " + celsius + " in Celsius");
        scanner.close();
    }
}
