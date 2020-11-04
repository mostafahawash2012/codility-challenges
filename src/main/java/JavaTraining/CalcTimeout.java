package JavaTraining;

import java.util.Arrays;

public class CalcTimeout {

	public static void main(String args[]) {
		long startTime = System.nanoTime();
		//int a=5;
		//int b=a/2;
		//System.out.println("Solution : "+b);
		int [] arr = new int []{1,22,32,44,567,865,2,54,64,8,21};
		java.util.Arrays.sort(arr);
		//Arrays.sort(arr);
      long endTime   = System.nanoTime();
      long totalTime = endTime - startTime;
     // System.out.println("total time :" +(double)totalTime/1_000_000_000.0);
	}
}
