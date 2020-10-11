package com.codility.lessons.prefixSums;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class GenomicRangeQueryTest {

	@Test
	public void test() {
		int[] answers = { 2, 4, 1 };

		assertArrayEquals(answers, GenomicRangeQuery.solution("CAGCCTA", new int[] { 2, 5, 0 }, new int[] { 4, 5, 6 }));
	}
}
