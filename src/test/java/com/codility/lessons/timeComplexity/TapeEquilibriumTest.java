package com.codility.lessons.timeComplexity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TapeEquilibriumTest {

	@Test
	public void test() {

		int[] a = new int[] { 3, 1, 2, 4, 3 };

		assertEquals(1, TapeEquilibrium.solution(a));
	}
}
