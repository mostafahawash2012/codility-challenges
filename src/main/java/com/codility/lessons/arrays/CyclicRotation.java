package com.codility.lessons.arrays;

public class CyclicRotation {

	public static int[] solution(int[] A, int k) {
		int result[] = new int[A.length];
		int newIndex;
		for (int i = 0; i < A.length; i++) {
			newIndex = (i + k) % A.length;
			result[newIndex] = A[i];
		}
		return result;
	}

}
