package com.codility.lessons.sorting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DistinctTest {

	@Test
	public void test() {
		assertEquals(3, Distinct.solution(new int [] {2,1,1,2,3,3}));
	}
}
