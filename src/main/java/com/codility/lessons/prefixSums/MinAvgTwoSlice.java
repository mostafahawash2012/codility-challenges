package com.codility.lessons.prefixSums;

public class MinAvgTwoSlice {
	
	public static int solution(int[] A) {
		int min = Integer.MAX_VALUE;
		int index = 0;
		int sum, avg, j;
		for (int i = 1; i < A.length - 1; i++) {
			avg = 0;
			sum = 0;
			for (j = i; j < A.length; j++) {
				sum += A[j];
			}
			avg = sum / (j - i + 1);
			if (avg < min) {
				min = avg;
				index = i;
			}
		}

		return index;
	}
	
}
