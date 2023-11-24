public class SumOfOddIntegers 
{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sumOfOdds = calculateSumOfOdds(numbers);
        System.out.println("The sum of odd integers is: " + sumOfOdds);
    }

    public static int calculateSumOfOdds(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) 
            {
                sum += num;
            }
        }
        return sum;
    }
}
