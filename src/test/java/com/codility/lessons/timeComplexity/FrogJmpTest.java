package com.codility.lessons.timeComplexity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrogJmpTest {

	@Test
	public void test() {
		assertEquals(3, FrogJmp.solution(10, 85, 30));
		assertEquals(3, FrogJmp.solution(15, 200, 80));
	}
}
