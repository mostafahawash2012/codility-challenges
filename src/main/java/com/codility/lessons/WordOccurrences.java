package com.codility.lessons;

import java.util.Arrays;

public class WordOccurrences {

	static public int solution(String S) {
		char s[] = S.toCharArray();
		int [] charCount = new int[5];
		for(int i=0 ; i<s.length ; i++) {
			
			if(s[i] == 'B') {
				charCount[0]++;
			}
			if(s[i] == 'A') {
				charCount[1]++;
			}
			
			if(s[i] == 'L') {
				charCount[2]++;
			}
			
			if(s[i] == 'O') {
				charCount[3]++;
			}
			
			if(s[i] == 'N') {
				charCount[4]++;
			}
		}
		
		charCount[2] = charCount[2]/2;
		charCount[3] = charCount[3]/2;
		int result=charCount[0];
		System.out.println(Arrays.toString(charCount));
		for(int i=0 ; i<charCount.length ; i++) {
				if(charCount[i]<result)
					result=charCount[i];
		}

		return result;
	}
	public static void main(String[] args) {
		int A[] = { 3,1,2,4,3};

		System.out.println("Sol : " + solution("BAONXXOLL"));
		Object o = new Object();
		System.out.println(o.getClass());
		
		

	}

}
