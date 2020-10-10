package com.codility.lessons.countingElements;

import java.util.Arrays;

public class MaxCounters {

	static public int[] solution(int N, int[] A) {

		int max = 0;
		int[] counters = new int[N];
		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 1 && A[i] <= N) {
				counters[A[i] - 1]++;
				if (counters[A[i] - 1] > max) {
					max = counters[A[i] - 1];
				}
			}
			if (A[i] == (N + 1)) {
				Arrays.fill(counters, max);
			}
		}

		return counters;
	}
}
