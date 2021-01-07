package lab1;

import java.util.Scanner;

public class Exercise2 {
	
	public static void checkAssignment1(String color) {
		switch(color) {
		case "red": System.out.println("STOP");
						break;	
		case "yellow": System.out.println("READY");
						break;
		case "green": System.out.println("GO");
						break;
		default:
				System.out.println("colour is invalid");
		}
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the color");
		 String color = sc.next();
		 checkAssignment1(color);
		 sc.close();

	}

}
