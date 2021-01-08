package lab3;

import java.util.*;

public class Exercise6 {

	public static boolean positiveString(String string1) {

		for (int index = 0; index < string1.length()-1; index++) {
			 // if element at index 'i' is less  
            // than the element at index 'i-1'  
            // then the string is not sorted  
			if (((string1.charAt(index))) > ((string1.charAt(index + 1)))) {
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// check whether the string is  
        // in alphabetical order or not  
		System.out.println("Enter a String....");
		String string1 = sc.next();
		System.out.println(positiveString(string1));
		sc.close();

	}

}
