package com.codility.lessons.timeComplexity;

public class FrogJmp {

	public static int solution(int X, int Y, int D) {

		double result = ((double) (Y - X) / (double) D);
		if (result % 1 != 0) {
			result = Math.ceil(result);
		}

		return (int) result;
	}
}
