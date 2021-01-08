package lab3;

import java.util.*;

public class Exercise2 {

	
	public static String getString(String s1) {
		StringBuffer string1 = new StringBuffer(s1);
		string1.append('|');
		StringBuffer string2 = new StringBuffer(s1);
		string2.reverse();
		string1.append(string2);
		return string1.toString();
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String string1 = sc.next();
		String result = getString(string1);
		System.out.println(result);
		sc.close();

	}

}
