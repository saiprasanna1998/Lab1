/**
*Author: Prasanna
*Desc: Remove duplicates from sorted array
*/ 

package lab2; 
import java.util.Arrays;

import java.util.Scanner;

public class Exercise4 {

	private static int[] sorted(int arr[]) {
		int n = arr.length;
		int[] temp = new int[n];
		int j = 0;
		Arrays.sort(arr);
		for (int i = 0; i < n - 1; i++) {   	 // If current element is not equal 
            									 //to next element then store that 
												 //current element 
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
											// Store the last element as whether 
		        							// it is unique or repeated, it hasn't 
											// stored previously 
			}
		}
		temp[j++] = arr[n - 1];
		int sortarr[] = new int[j];
		for (int i1 = 0; i1 < j; i1++) {   // Modify original array 
			sortarr[i1] = temp[i1];
		}
		
		return sortarr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no : of elements");
		int n = sc.nextInt();
		System.out.println("Enter the elements");
		int array[] = new int[n];
		for (int index = 0; index < n; index++) {   // Print updated array 
			array[index] = sc.nextInt();
		}
		System.out.println("-------------");
		int[] result = sorted(array);
		for(int i = result.length-1;i >=0;i--) {
			System.out.println(result[i]);
		}
		
	}

}
