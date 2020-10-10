package com.codility.lessons.timeComplexity;

public class PermMissingElem {

	public static int solution(int[] A) {

		long N = A.length + 1;
		long sum = N * (N + 1) / 2; // sum consecutive numbers
		for (int i = 0; i < A.length; i++) {
			sum -= A[i];
		}
		return (int) sum;
	}

}
