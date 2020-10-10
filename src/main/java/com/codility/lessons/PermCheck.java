package com.codility.lessons;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

	static public int solution(int[] A) {
		
		long N = A.length;
		long perm = N * (N + 1) / 2;
		int sum =0;
		for(int i=0 ; i<A.length ; i++) {
			sum+=A[i];
		}
		
		return (sum == perm ? 1 : 0);
	}
	
	
	static public int solution2(int[] A) {
        // write your code in Java SE 8
        
        // to check "permutation"
        // the main idea is as follows:
        // 1. use set to remember which elements have appeared
        // 2. use "for loop" to check if all the elements from "1 to A.length" appeared
        // If all the elements have appeared, then "yes".
        // Otherwise, "no".
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i < A.length; i++){
            set.add(A[i]);
        }
        
        // check if "all" the elements from "1 to A.length" appeared
        for(int i=1; i<= A.length; i++){
            if( set.contains(i) == false )
                return 0; // not a permutation (A[i] is missing)
        }
        
        // if it contains all the elements (from "1 to A.length")
        // then, "yes"
        return 1;  
	}
	public static void main(String[] args) {
		
		int A[] = { 1,3,4};
		System.out.println("Sol : " + solution(A));
	}

}
