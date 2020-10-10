package com.codility.lessons.countingElements;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PermCheckTest {

	@Test
	public void test() {
		int a[] = { 4, 1, 3, 2 };
		int b[] = { 4, 1, 3 };

		assertEquals(1, PermCheck.solution(a));
		assertEquals(0, PermCheck.solution(b));
	}
}
