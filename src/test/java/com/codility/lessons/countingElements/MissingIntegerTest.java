package com.codility.lessons.countingElements;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MissingIntegerTest {

	@Test
	public void test() {

		int a[] = { 1, 3, 6, 4, 1, 2 };
		int b[] = { 1, 2, 3 };
		int c[] = { -1, -3 };
		int aSol = 5;
		int bSol = 4;
		int cSol = 1;

		assertEquals(aSol, MissingInteger.solution(a));
		assertEquals(bSol, MissingInteger.solution(b));
		assertEquals(cSol, MissingInteger.solution(c));
	}
}
