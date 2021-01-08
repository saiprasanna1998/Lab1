/**
*Author: Prasanna
*Desc: program to sort a string alphabetically
*/
package lab2;

import java.util.Arrays;

import java.util.Scanner;

public class Exercise2 {   // Method to sort a mixed string //
	
	public static String[] sortStrings(String[] a)
	{
	Arrays.sort(a);
	int n=a.length;  // the string length //
	String[] b=a;
	if(n%2!=0) {
	int m=(n/2)+1;
	for(int i=0;i<m;i++) {
	b[i]=a[i].toUpperCase();
	}
	for(int j=m;j<n;j++)
	{
	b[j]=a[j].toLowerCase();
	}

	}
	else
	{
	int m=n/2;
	for(int i=0;i<m;i++) {
	b[i]=a[i].toUpperCase();
	}
	for(int j=m;j<n;j++)
	{
	b[j]=a[j].toLowerCase();
	}

	}
	return b;
	}



	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n");
	int p=sc.nextInt();
	String q[]=new String[p];
	System.out.println("Enter the strings: ");
	for(int i=0;i<p;i++)
	{
	q[i]=sc.next();
	}
	Exercise2 e=new Exercise2();
	String[] result=e.sortStrings(q);
	System.out.println("The resulting  string array is ");
	for(int i=0;i<p;i++)
	{
	System.out.println(result[i]+" ");
	}
	
	}

}
