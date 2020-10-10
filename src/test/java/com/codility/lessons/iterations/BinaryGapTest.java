package com.codility.lessons.iterations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codility.lessons.iterations.BinaryGap;

public class BinaryGapTest {

	@Test
	public void test() {

		assertEquals(2, BinaryGap.solution(9));
		assertEquals(4, BinaryGap.solution(529));
		assertEquals(5, BinaryGap.solution(1041));
		assertEquals(1, BinaryGap.solution(20));
	}
}
