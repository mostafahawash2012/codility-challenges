package com.codility.lessons.timeComplexity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PermMissingElemTest {

	@Test
	public void test() {
		int[] a = new int[] { 2, 3, 1, 5 };
		int sol1 = 4;
		int[] b = new int[] { 2, 3, 1, 4, 6 };
		int sol2 = 5;

		assertEquals(sol1, PermMissingElem.solution(a));
		assertEquals(sol2, PermMissingElem.solution(b));
	}
}
