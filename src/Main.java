import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> getFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }

        return factors;
    }
    public static void main(String[] args) {
        //TODO convert function to BigInteger for larger numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to check its factors: ");
        int userInput = scanner.nextInt();
        ArrayList<Integer> result = getFactors(userInput);
        System.out.printf("Factors of %d:%n" +
                "%s", userInput, result);
    }
}