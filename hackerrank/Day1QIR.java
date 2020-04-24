package com.pranav.hackerrank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Day1QIR {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr1[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = scan.nextInt();
		}

		int arr2[] = new int[n];
		int Elements = 0;
		for (int i = 0; i < n; i++) {
			arr2[i] = scan.nextInt();
			Elements += arr2[i];
		}

		int[] data = new int[Elements];
		int Index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < arr2[i]; j++) {
				data[Index] = arr1[i];
				Index++;
			}
		}
		Arrays.sort(data);

		double qua1 = findMedian(data, 0, data.length / 2 - 1);
		double qua3 = findMedian(data, (data.length + 1) / 2, data.length - 1);
		System.out.println(qua3 - qua1);
	}

	private static double findMedian(int[] array, int start, int end) {
		if ((end - start) % 2 == 0) {
			return (array[(end + start) / 2]);
		} else {
			int value1 = array[(end + start) / 2];
			int value2 = array[(end + start) / 2 + 1];
			return (value1 + value2) / 2.0;
		}
	}
}