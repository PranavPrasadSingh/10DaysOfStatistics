package com.pranav.hackerrank;

import java.math.BigDecimal;
import java.util.Scanner;

public class Day0QWM {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        

        Scanner scan1 = new Scanner(System.in);
        int n = scan1.nextInt();
        if (n >= 5 && n <= 50) {

            int arr1[] = new int[n];

            for (int i = 0; i < n; i++) {
                int userInput = scan1.nextInt();
                arr1[i] = userInput;
            }

            int arr2[] = new int[n];

            for (int i = 0; i < n; i++) {
                int userInput = scan1.nextInt();
                arr2[i] = userInput;
            }
            double weightedMean = weightedMean(arr1, arr2, n);

            System.out.println(String.format("%.1f", new BigDecimal(weightedMean)));
        }

    }

    public static double weightedMean(int X[], int W[], int n) {
        int sum = 0, numWeight = 0;

        for (int i = 0; i < n; i++) {
            numWeight = numWeight + X[i] * W[i];
            sum = sum + W[i];

        }

        return (double) (numWeight) / sum;
    }
}
