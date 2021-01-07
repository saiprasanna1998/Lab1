package lab1;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the n-digit number");
	int n=s.nextInt();
	int a=findCubes(n);
	System.out.println("Sum of the cubes of the digits of a number : "+a );
	}
	 private static int findCubes(int a)
	 {
	int sum=0;
	while(a>0)
	{
	int b=a%10;
	int c=b*b*b;
	sum=sum+c;
	a=a/10;

	}
	return sum;

	}

}
