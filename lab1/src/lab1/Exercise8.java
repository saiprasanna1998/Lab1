package lab1;

import java.util.Scanner;

public class Exercise8 {
	
	public static int checkNumber(int n) {
		if (n == 0) 
	        return 0; 
	    while (n != 1) 
	    { 
	        if (n%2 != 0) 
	            return 0; 
	        n = n/2; 
	    } 
	    return 1; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n");
		int num = sc.nextInt();
		int res = checkNumber(num);
		if(res == 1)
			System.out.println("true");
		else
			System.out.println("false");


	}

}
