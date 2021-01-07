package lab1;

import java.util.Scanner;

public class Exercise4 {

	public static void primeornot(int number) {
		int n, i;

		for (n = 1; n <= number; n++) {
			int flag = 0;
			for (i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					flag++;
					break;
				}

			}

			if (flag == 0 && n != 1) {
				System.out.println(n);

			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int num = sc.nextInt();
		primeornot(num);
		sc.close();
		// TODO Auto-generated method stub
		
	}

}
