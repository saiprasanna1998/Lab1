package lab1;

import java.util.Scanner;

public class Exercise7 {
	
	public static boolean checkNumber(int num) {
	       boolean flag = false;
	       int currentDigit = num % 10;
	       num = num/10;
	       while(num>0){
	           if(currentDigit <= num % 10){
	               flag = true;
	               break;
	           }
	           currentDigit = num % 10;
	           num = num/10;
	       }      
	       if(flag){
	           return false;
	       }else{
	           return true;
	       }
	    }
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("res");
	int num = sc.nextInt();
	sc.close();


	}

}
