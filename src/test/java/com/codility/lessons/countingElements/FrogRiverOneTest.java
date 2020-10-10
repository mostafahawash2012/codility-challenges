package com.codility.lessons.countingElements;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrogRiverOneTest {

	@Test
	public void test() {

		int A[] = { 1, 3, 1, 4, 2, 3, 5, 4 };
		assertEquals(6, FrogRiverOne.solution(5, A));
	}
}
