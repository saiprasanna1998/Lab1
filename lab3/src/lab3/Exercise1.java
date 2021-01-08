package lab3;

import java.util.*;

public class Exercise1 {
	

	public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with one space gap:"); // Give the integers with one space gap //
        String string1 = sc.nextLine();
        StringTokenizer st = new StringTokenizer(string1, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("sum of the integers is: " + sum);
        sc.close();

	}

}
