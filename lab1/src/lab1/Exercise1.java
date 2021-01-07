package lab1;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello Dear Friends";
		// Output as : Friends Dear Hello
		String output = reverseString(str1);
		System.out.println(output);

	}
	private static String reverseString(String input) {
		String[] words = input.split("\s");
		
		String outputString = "";
		
		for (int i = words.length-1; i >= 0 ; i--)
		{
			outputString = outputString + words[i] + " ";
		}
		return outputString;
	}


	}

