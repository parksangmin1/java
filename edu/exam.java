package edu;

import java.util.Arrays;
import java.util.Random;

public class exam {
	 class Matrix{
		 int[][] array;
		
		 
		public Matrix(int[] array , int index, int row,int column) {		 
		 	int[][] temp = new int[row][column];	
			for(int i = 0; i < row; i++ )
		 			for(int j =0; j < column; j++) {
		 				temp[row][column] = array[index++];
		 			}
		}
		static void sum(Matrix nA,Matrix nB) {
			
			
		}
		static void mul(Matrix nA,Matrix nB) {
			
		}
		}
	 public static void sortArray(int[] arr) {
		 int temp;
		 for(int i = 0; i<arr.length-1; i++) {
//			 Arrays.sort(arr);
			for(int j = i+1; j< arr.length; j++) {
				if(arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
			
		 }		
	 }
	 public static void print() {
		
	 }
	 
	public static void main(String[] args) {
	
		int[] arr = new int[24];
		int[] array = new int[24];
		Random rd = new Random();
		
		for (int i = 0; i < 24; i++) {
			arr[i] = rd.nextInt(101);
		}
		System.out.println(Arrays.toString(arr));
		
		sortArray(arr);
		
		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(temp));
		
//		int [][] ar = {{1,2,3,4}, 
//						{5,6,7,8},
//						{9,10,11,12}};
//		System.out.println(Arrays.toString(ar));
		
		
//		Matrix nA = new Matrix(array, 0, 3, 4);
//		Matrix nB = new Matrix(array, 0, 3, 4);
	}			
}
