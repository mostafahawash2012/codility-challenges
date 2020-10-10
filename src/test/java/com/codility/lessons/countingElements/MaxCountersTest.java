package com.codility.lessons.countingElements;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MaxCountersTest {

	@Test
	public void test() {

		int A[] = { 3, 4, 4, 6, 1, 4, 4 };
		int sol[] = { 3, 2, 2, 4, 2 };

		assertArrayEquals(sol, MaxCounters.solution(5, A));
	}
}
