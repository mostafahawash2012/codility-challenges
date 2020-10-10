package com.codility.lessons.countingElements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PermCheck {

	static public int solution(int[] A) {

		int[] perm = IntStream.rangeClosed(1, A.length).toArray();
		List<Integer> listA = Arrays.stream(A).boxed().collect(Collectors.toList());
		for (int num : perm) {
			if (!listA.contains(num))
				return 0;
		}

		return 1;
	}

}
