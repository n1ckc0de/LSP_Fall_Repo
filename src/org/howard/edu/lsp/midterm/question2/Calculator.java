public class Calculator {

    // Method to sum two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method to sum two double values
    public static double sum(double a, double b) {
        return a + b;
    }

    // Method to sum all elements in an array of integers
    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
