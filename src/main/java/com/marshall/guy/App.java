package com.marshall.guy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static ArrayList<BigInteger> getFactors(BigInteger number)
    {
        ArrayList<BigInteger> factors = new ArrayList<>();
        BigInteger halfNumber = number.divide(BigInteger.TWO);

        for (BigInteger i = BigInteger.TWO; i.compareTo(halfNumber) <= 0; i = i.add(BigInteger.ONE))
        {
            if (number.mod(i).equals(BigInteger.ZERO))
            {
                factors.add(i);
            }
        }

        return factors;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to check its factors: ");
        BigInteger userInput = scanner.nextBigInteger();
        scanner.close();
        ArrayList<BigInteger> result = getFactors(userInput);
        System.out.printf("Factors of %d:%n" +
                "%s", userInput, result);
    }
}
