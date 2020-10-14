package com.codility.lessons.sorting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxProductOfThreeTest {

	@Test
	public void test() {
		assertEquals(60, MaxProductOfThree.solution(new int[] { -3, 1, 2, -2, 5, 6 }));
	}
}
