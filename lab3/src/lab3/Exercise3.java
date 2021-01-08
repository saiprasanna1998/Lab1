package lab3;

import java.util.*;

public class Exercise3 {
	
	public static String alterStrings(String str) {
		char ch;
		String s1 = "";
		for (int i = 0; i < str.length(); i++) {  // traversing the string 
			ch = str.charAt(i);
			int a = ch;
			if (!(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
					|| ch == 'U' || ch == 'u')) {
				ch = (char) (a + 1);
				s1 = s1 + ch;
			} else {
				s1 = s1 + ch;   // if next immediate alphabet is vowel, 
								// than take next 2nd immediate alphabet
			}
		}

		return s1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String........");
		String s1 = sc.next();
		System.out.println(alterStrings(s1));
		sc.close();

	}

}
