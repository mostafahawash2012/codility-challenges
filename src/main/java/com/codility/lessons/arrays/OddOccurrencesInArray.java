package com.codility.lessons.arrays;

import java.util.HashSet;

public class OddOccurrencesInArray {

	 static int solution (int [] A) {
		 HashSet<Integer> set = new HashSet<Integer>(A.length/2); //new HashSet(int initialCapacity)
			
			for(int i = 0; i < A.length; i++) {
				if (set.contains(A[i])) {
					set.remove(A[i]);
				} else {
					set.add(A[i]);
				}
			}
			return (int) set.toArray(new Integer[0])[0];
			
			/*
			 * The JVM doesn’t know the desired object type, so toArray() method returns an Object[].
			 *  We can pass a typed array to overloaded toArray(T[] a)
 				function to let JVM know what your desired object type is.
 				Integer[] array = set.toArray(new Integer[set.size()]);
			 * */
	}

}
