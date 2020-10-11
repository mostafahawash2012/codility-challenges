package com.codility.lessons.prefixSums;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinAvgTwoSliceTest {
	@Test
	public void test() {

		assertEquals(1, MinAvgTwoSlice.solution(new int[] { 4, 2, 2, 5, 1, 5, 8 }));
	}
}
