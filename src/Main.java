import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//    static ArrayList<Integer> getFactors(int number) {
//        ArrayList<Integer> factors = new ArrayList<>();
//
//        for (int i = 1; i <= number; i++) {
//            if (number % i == 0) {
//                factors.add(i);
//            }
//        }
//
//        return factors;
//    }
    public static ArrayList<BigInteger> getFactors(BigInteger number) {
        ArrayList<BigInteger> factors = new ArrayList<>();

        for (BigInteger i = BigInteger.ONE; i.compareTo(number) <= 0; i = i.add(BigInteger.ONE)) {
            if (number.mod(i).equals(BigInteger.ZERO)) {
                factors.add(i);
            }
        }

        return factors;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to check its factors: ");
        BigInteger userInput = scanner.nextBigInteger();
        ArrayList<BigInteger> result = getFactors(userInput);
        System.out.printf("Factors of %d:%n" +
                "%s", userInput, result);
    }
}