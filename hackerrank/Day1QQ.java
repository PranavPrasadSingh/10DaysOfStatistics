package com.pranav.hackerrank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Day1QQ {
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

			Arrays.sort(arr1);

			int q1 = findMedian(arr1, 0, arr1.length / 2 - 1);
			int q2 = findMedian(arr1, 0, arr1.length - 1);
			int q3 = findMedian(arr1, (arr1.length + 1) / 2, arr1.length - 1);

			System.out.println(q1);
			System.out.println(q2);
			System.out.println(q3);
		}
	}

	private static int findMedian(int[] array, int start, int end) {
		if ((end - start) % 2 == 0) { // odd number of elements
			return (array[(end + start) / 2]);
		} else { // even number of elements
			int value1 = array[(end + start) / 2];
			int value2 = array[(end + start) / 2 + 1];
			return Math.round((value1 + value2) / 2);
		}
	}
}
