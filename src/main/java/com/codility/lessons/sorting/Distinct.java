package com.codility.lessons.sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

	public static int solution(int[] A) {

		Set<Integer> distinct = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			distinct.add(A[i]);
		}
		return distinct.size();
	}
}
