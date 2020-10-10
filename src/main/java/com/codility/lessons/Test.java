package com.codility.lessons;

import java.util.Arrays;

public class Test {
	public String solution(String S, int K) {

		String week[] = new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
		int currentDay = Arrays.asList(week).indexOf(S);
		int newDay = (currentDay + K) % 7;

		return week[newDay];
	}

	public static int sol(int[] A) {
		int total = 0, prev = 0, next = 0, diff=Integer.MAX_VALUE;
		for (int i = 0; i < A.length; i++)
			total += A[i];

		for (int p = 1; p < A.length; p++) {
			prev += A[p - 1];
			next = total - prev;
			diff = Math.min(diff, Math.abs(prev - next));
			
		}
		return diff;
	}

	public static void main(String[] args) {

		 System.out.println(sol(new int[] {3,1,2,4,3}));

	}

}
