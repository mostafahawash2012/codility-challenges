package com.codility.lessons.prefixSums;

public class CountDiv {

	public static int solution(int A, int B, int K) {
		int count = 0;
		for (int i = A; i <= B; i++) {
			if (i % K == 0)
				count++;
		}
		return count;
	}
}
