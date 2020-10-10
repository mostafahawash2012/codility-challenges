package JavaTraining.JavaTraining;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MedianCountingSort {
//https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem?h_r=next-challenge&h_v=zen
    // Complete the activityNotifications function below.
	
	static float calcMedian(int c[] ,int dd ,int  mpp){
		int left=0,addition=0; 
		System.out.println("Median mp "+mpp);
		System.out.println(Arrays.toString(c));
		//step 3) Now traverse this frequency array and start adding all the elements till the addition>=midindex
		for(addition=0 ,left=0; addition<mpp ; left++){
			addition+=c[left];
			//step 4) The index of frequency array where the condition (addition>=midindex) occurs is the median.
		}
		// 0 1 1 1 2 
		System.out.println("left "+ left);
		//return --left;
		int right = left;
		left--;
		if(addition>mpp || dd%2 !=0){ // search for how using the counting sort to get the median 
			return left;
		}else{
			while(c[right] == 0){// counting +1 with every 0 to get the next number after the left so we can do (left+right)/2
				right++;
			}
			return (float)(left+right)/2;
		}
		
		//return 0;
	} 
	
    static int activityNotifications(int[] exp, int d) {
    	
    	if(exp.length<=d){
    		return 0;
    	}
    	
    	int cSort[] = new int[201];
    	//counting sort -  step 1) create an array which represents the frequency of the values from 0 to d
    	for(int i=0 ; i<d ; i++){
    		cSort[exp[i]]+=1;
    	}
    	// calculating median position -  step 2)mid_index = (length of array)/2
    	int mp = 0;
    	if(d%2 == 0){
			mp=d/2;// right value of average
		}else{
			mp= (d/2)+1;
		}
    	
    	int end = d;
    	float median=0;
    	int count=0;
    	for(int i=0 ;end < exp.length; end++,i++){
    		median = calcMedian(cSort , d,mp);
    		System.out.println("Median " + median);
    		
    		if(exp[end]>= (median*2))
    			count++;
    		
    		// modifiying the counting list as we move one index forward
    		cSort[exp[i]]-=1;//decrementing the the old value 
    		cSort[exp[end]]+=1;// adding the new value
    	}

    	return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static boolean isNumeric(String str) {
    	  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    	}
    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] nd = scanner.nextLine().split(" ");
//
//        int n = Integer.parseInt(nd[0]);
//
//        int d = Integer.parseInt(nd[1]);
//
//        int[] expenditure = new int[n];
//
//        String[] expenditureItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int expenditureItem = Integer.parseInt(expenditureItems[i]);
//            expenditure[i] = expenditureItem;
//        }
    	BufferedReader br = new BufferedReader(new FileReader("D:/values.txt"));
    	String line;
    	int arr[] = new int [200000];
    	int index=0;
	    while ((line = br.readLine()) != null) {
      
		     String [] sA = line.split(" ");
		     for(int i = 0; i<sA.length ; i++){
		    	 if(isNumeric(sA[i])){
			    	 arr[index] = Integer.parseInt(sA[i]);
			    	 index++;
		    	 }

		     }
	     }
	    br.close();
	      System.out.println("Arra " +Arrays.toString(arr));
	      System.out.println("Lengh "+arr.length);
        int result = activityNotifications(arr, 10000);//
        System.out.println("Result: "+result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
