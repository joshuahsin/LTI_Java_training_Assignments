package com.Day3Assignments;

public class DemoArray {
	public static void main(String[] args) {
		int firstArrayMatrix[][] = {{1,1,1},{1,1,1}};
		int secondArrayMatrix[][] = {{2,2,2},{2,2,2}};
		
		System.out.println("Matrix 1");
		for(int[] row: firstArrayMatrix) {
			for(int element: row) {
				System.out.print(" " + element);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Matrix 2");
		for(int[] row: secondArrayMatrix) {
			for(int element: row) {
				System.out.print(" " + element);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Sum of the Matrices");
		for(int i = 0; i < firstArrayMatrix.length; i++) {
			for(int j = 0; j < firstArrayMatrix[0].length; j++) {
				System.out.print(" " + 
						(firstArrayMatrix[i][j] + secondArrayMatrix[i][j]));
			}
			System.out.println();
		}
	}
	
}
