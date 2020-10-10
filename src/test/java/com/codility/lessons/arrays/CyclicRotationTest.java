package com.codility.lessons.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.codility.lessons.arrays.CyclicRotation;

public class CyclicRotationTest {

	@Test
	public void test() {
		int[] array1 = new int[] { 3, 8, 9, 7, 6 };
		int[] array1Sol = new int[] { 9, 7, 6, 3, 8 };
		int K1 = 3;

		int[] array2 = new int[] { 1, 2, 3, 4 };
		int[] array2Sol = new int[] { 1, 2, 3, 4 };
		int K2 = 4;

		assertArrayEquals(array1Sol, CyclicRotation.solution(array1, K1));
		assertArrayEquals(array2Sol, CyclicRotation.solution(array2, K2));
	}

}
