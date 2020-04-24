package com.pranav.hackerrank;

import java.util.*;

public class Day0QMMM {
	public static void main(String[] args) {
     

        Scanner scan = new Scanner(System.in);
       
        int n = scan.nextInt();

        int arr[] = new int[n];
        

        for (int i = 0; i < n; i++) {
            int userInput = scan.nextInt();
            arr[i] = userInput;
        }

        double mean = calculateMean(arr, n);

        double median = calculateMedian(arr, n);

        int mode = calculateMode(arr);

        // Print results
        System.out.println( mean);
        System.out.println( median);
        System.out.println( mode);

    }

    public static double calculateMean(int[] arr, int len) {
        double sum = 0;

        for (int i = 0; i < len; i++) {
            sum = sum + arr[i];

        }

        double mean = ((double) sum) / len;

        return mean;
    }

    public static double calculateMedian(int[] arr, int len) {
        Arrays.sort(arr);

        // check for even case
        if (len % 2 != 0)
            return (double) arr[len / 2];

        return (double) (arr[(len - 1) / 2] + arr[len / 2]) / 2.0;
    }

    public static int calculateMode(int[] arr) {

        int modeCount = 0; // The count of the mode value
        int mode = 0; // The value of the mode

        int currCount = 0;

        // Iterate through all values in our array and consider it as a possible mode
        for (int candidateMode : arr) {
            // Reset the number of times we have seen the current value
            currCount = 0;

            // Iterate through the array counting the number of times we see the current
            // candidate mode
            for (int element : arr) {
                // If they match, increment the current count
                if (candidateMode == element) {
                    currCount++;
                }
            }

            // We only save this candidate mode, if its count is greater than the current
            // mode
            // we have stored in the "mode" variable
            if (currCount > modeCount) {
                modeCount = currCount;
                mode = candidateMode;
            }
        }

        return mode;
    }  
    
}
