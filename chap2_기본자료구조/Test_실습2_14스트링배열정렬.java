package chap2_기본자료구조;

import java.util.Arrays;

public class Test_실습2_14스트링배열정렬 {
	public static void main(String[] args) {
		String []data = {"apple","grape","persimmon", "pear","blueberry", "strawberry", "melon", "oriental melon"};

		showData(data);
		System.out.println("정렬 후후후후후훟후ㅜㅎ후후후후후후후후후후후후후후후후후후후후후후후후후후훕");
//		sortData(data);
		Arrays.sort(data);	
		showData(data);
	
		
		
	}	
	static void showData(String[]arr) {
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void swap(String[]arr, int ind1, int ind2) {
		String temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
	}
	static void sortData(String []arr) {
		String temp ;
		for(int i = 0; i< arr.length; i++)
			for(int j= i+1; j< arr.length; j++) {
				if(arr[i].compareTo(arr[j])>0);{
				swap(arr, i, j);
				}
			}
		
	}

}