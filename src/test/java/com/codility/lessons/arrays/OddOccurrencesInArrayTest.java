package com.codility.lessons.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OddOccurrencesInArrayTest {

	@Test
	public void test() {

		int[] a = new int[] { 9, 3, 7, 7, 3, 5, 9 };
		int sol1 = 5;

		int[] b = new int[] { 9, 9, 8, 8, 6 };
		int sol2 = 6;

		assertEquals(sol1, OddOccurrencesInArray.solution(a));
		assertEquals(sol2, OddOccurrencesInArray.solution(b));
	}
}
