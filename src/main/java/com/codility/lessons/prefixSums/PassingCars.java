package com.codility.lessons.prefixSums;

public class PassingCars {

	static public int solution(int[] A) {

		int counter = 0, countZero = 0, pair = 0;
		for (int i = A.length - 1; i >= 0; i--) {
			counter++;
			if (A[i] == 0) {
				countZero++;
				pair += counter - countZero;
				if (pair > 1000000000)
					return -1;
			}
		}

		return pair;
	}

}
