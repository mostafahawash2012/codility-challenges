package com.codility.lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrogRiverOne {

	static public int solution(int X, int[] A) {

		Set<Integer> values = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (values.add(A[i]))
				X--;
			if (X == 0)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		int A[] = { 1, 3, 1, 4, 2, 3, 5, 4 };
		System.out.println("Sol : " + solution(5, A));
		// answer (got 3 expected 4).

	}

}
