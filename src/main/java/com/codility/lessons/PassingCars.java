package com.codility.lessons;

public class PassingCars {

	static public int solution(int[] A) {
		
		int counter=0,countOne=0,countZero=0,pair=0;
		for(int i=A.length-1 ; i>=0 ; i--) {
			counter++;
			if(A[i] == 1) {
				countOne++;
			}else {
				countZero++;
				pair+= counter-countZero;
				if (pair > 1000000000)
					return -1;
			}
		}
		
		return pair;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
