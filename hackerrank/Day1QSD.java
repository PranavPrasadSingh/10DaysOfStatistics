package com.pranav.hackerrank;

import java.math.BigDecimal;
import java.util.Scanner;

public class Day1QSD {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner scan1 = new Scanner(System.in);
		int n = scan1.nextInt();
		if (n >= 5 && n <= 50) {

			int arr1[] = new int[n];

			for (int i = 0; i < n; i++) {
				int userInput = scan1.nextInt();
				arr1[i] = userInput;
			}

			double calculateSD = calculateSD(arr1,  n);

			System.out.println(String.format("%.1f", new BigDecimal(calculateSD)));
		}

	}

	public static double calculateSD(int numArray[], int n) {
		double sum = 0.0, standardDeviation = 0.0;
		int length = numArray.length;

		for (double num : numArray) {
			sum += num;
		}

		double mean = sum / n;

		for (double num : numArray) {
			standardDeviation += Math.pow(num - mean, 2);
		}

		return Math.sqrt(standardDeviation / n);
	}
}
