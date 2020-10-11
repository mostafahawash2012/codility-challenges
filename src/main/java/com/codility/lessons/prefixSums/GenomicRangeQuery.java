package com.codility.lessons.prefixSums;

import java.util.HashMap;
import java.util.Map;

public class GenomicRangeQuery {

	public static int[] solution(String S, int[] P, int[] Q) {

		int[] answers = new int[P.length];
		int start, end, answer;
		Map<String, Integer> factors = new HashMap<String, Integer>();
		factors.put("A", 1);
		factors.put("C", 2);
		factors.put("G", 3);
		factors.put("T", 4);

		for (int i = 0; i < P.length; i++) {
			start = P[i];
			end = Q[i];
			answer = factors.get(String.valueOf(S.charAt(start)));
			for (int j = start; j <= end; j++) {
				answer = Math.min(answer, factors.get(String.valueOf(S.charAt(j))));

			}
			answers[i] = answer;
		}

		return answers;
	}

}
