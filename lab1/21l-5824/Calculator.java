public class Calculator 
{
    public static double add(double a, double b) 
    {
        return a + b;
    }
    public static double subtract(double a, double b) 
    {
        return a - b;
    }
    public static double multiply(double a, double b) 
    {
        return a * b;
    }
    public static double divide(double a, double b) 
    {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) 
    {
        double operand1 = 10.0;
        double operand2 = 5.0;

        System.out.println("Addition: " + add(operand1, operand2));
        System.out.println("Subtraction: " + subtract(operand1, operand2));
        System.out.println("Multiplication: " + multiply(operand1, operand2));
        
        try 
        {
            System.out.println("Division: " + divide(operand1, operand2));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
