package com.codility.lessons.countingElements;

import java.util.HashSet;

public class MissingInteger {

	public static int solution(int[] A) {
		HashSet<Integer> seen = new HashSet<Integer>();
		int min = 1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0)
				seen.add(A[i]);
		}

		for (int i = 1; i <= seen.size() + 1; i++) {
			if (!seen.contains(i))
				return i;
		}

		return min;
	}

}
