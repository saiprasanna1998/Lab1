package lab2;

import java.util.Arrays;

import java.util.Scanner;

public class Exercise2 {
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string");
	        int n = sc.nextInt();
	        String[] str = new String[n];
	        //sc.next();
	        for (int i1 = 0; i1 < n; i1++) {
	            str[i1] = sc.next();
	        }
	        String result[] = sortString(str);
	        for (int i = 0; i < n; i++) {
	            System.out.println(result[i] + " ");
	        }
	        sc.close();

	    }
	    private static String[] sortString(String input[]) {
	        String[] result = input;
	        Arrays.sort(input);
	        System.out.println("Array after getting sorted.."+Arrays.toString(input));
	        int arraylen = input.length;
	        int mid = arraylen / 2;
	        if (arraylen % 2 != 0) {
	            mid = arraylen / 2 + 1;
	        }
	        for (int i = 0; i < mid; i++) {
	            result[i] = input[i].toUpperCase();
	        }
	        for (int i = mid + 1; i < arraylen; i++) {
	            result[i] = input[i].toLowerCase();

	        }

	        return result;
	}

}
