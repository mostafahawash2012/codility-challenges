package com;

import java.io.*;
import java.util.*;




public class MatrixLayarRotation {

    public static class Cell {

		public int row;
		public int column;

		public Cell(int row, int column) {
			super();
			this.row = row;
			this.column = column;
		}
	}
    // Complete the matrixRotation function below.
    static void matrixRotation(List<List<Integer>> matrix, int r) {
    	
    	int[][] array = new int[matrix.size()][matrix.get(0).size()];

    	int q = 0;
    	int[] primitive = new int[matrix.get(0).size()];
    	for (List<Integer> nestedList : matrix) {
    	     //in = nestedList.toArray(new Integer[nestedList.size()]);
    	     //array[q++] = ArrayUtils.toPrimitive(in);
    		primitive = //nestedList.stream()
				//	.mapToInt(Integer::intValue)
					//.toArray();
    		array[q++] = primitive;
    	}
        int n=matrix.get(0).size(),m=matrix.size();
        int[][] rotatedMatrix = new int[m][n];
		// We compute the number of "layers" of the matrix
		int numberOfLayers = Math.min(n, m) / 2;
		
		for (int i = 0; i < numberOfLayers; i++) {// 00 11
			// We compute the row and column boundaries of the current iteration
			//get the limits of the current layer .. 
			int rowLowerLimit = i;
			int rowUpperLimit = m - 1 - i;
			int columnLowerLimit = i;
			int columnUpperLimit = n - 1 - i;
			
			// We compute the path length of the current iteration, i.e. the number of cells of the current layer
			int pathLength = ((n - (i * 2)) * 2) + ((m - (i * 2)) * 2) - 4;// minus -4 because we subtract the 4 cells in the 4 angels since they're being added twice
			/*
		  (n-i*2)			 
		00 01 02 03 04
		10 11 12 13 14
(m-i*2)	20 21 22 23 24(m-i*2)
		30 31 32 33 34
		  (n-i*2)
			 
			 */
			ArrayList<Cell> path = new ArrayList<MatrixLayarRotation.Cell>();
			int currentRowIndex = i;//0 .. 1
			int currentColumnIndex = i;//0  .. 1
			boolean down = true;	
			boolean right = false;
			boolean up = false;
			boolean left = false;
			for (int j = 0; j < pathLength; j++) {// iterate through the current layer
				// We find the cells belonging to the current layer by following the current path.
				// When we reach one of the four corners of the current layer, we change
				// the direction of our moving in the path
				path.add(new Cell(currentRowIndex, currentColumnIndex));
				if (currentRowIndex == rowUpperLimit && currentColumnIndex == columnLowerLimit) {
					down = false;
					right = true;
				}
				if (currentRowIndex == rowUpperLimit && currentColumnIndex == columnUpperLimit) {
					right = false;
					up = true;
				}
				if (currentRowIndex == rowLowerLimit && currentColumnIndex == columnUpperLimit) {
					up = false;
					left = true;
				}
				if(down){
					currentRowIndex = currentRowIndex + 1;
				}
				if(right){
					currentColumnIndex = currentColumnIndex + 1;
				}
				if(up){
					currentRowIndex = currentRowIndex - 1;
				}
				if(left){
					currentColumnIndex = currentColumnIndex - 1;
				}

			}
			
			// We save the current layer into the corresponding rotated matrix layer
			for (int j = 0; j < pathLength; j++) {
				Cell currentCell = path.get(j);
				int numberToBeMoved = array[currentCell.row][currentCell.column];
				Cell newCell = path.get((j + r) % pathLength);
				rotatedMatrix[newCell.row][newCell.column] = numberToBeMoved;

			}

		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(rotatedMatrix[i][j] + " ");
			}
			System.out.println();
		}
    	
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] mnr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int m = Integer.parseInt(mnr[0]);
//
//        int n = Integer.parseInt(mnr[1]);
//
//        int r = Integer.parseInt(mnr[2]);

        List<List<Integer>> matrix = new ArrayList<List<Integer>>();

//        IntStream.range(0, m).forEach(i -> {
//            try {
//                matrix.add(
//                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                        .map(Integer::parseInt)
//                        .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
        
        List<Integer> inner = new ArrayList();
        inner.add(1);
        inner.add(2);
        inner.add(3);
        inner.add(4);
        List<List<Integer>> list = new ArrayList();
        list.add(inner);
        list.add(inner);
        list.add(inner);
        list.add(inner);
        
        matrixRotation(list, 1);

       // bufferedReader.close();
    }
}
