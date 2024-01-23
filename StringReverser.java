package programming_practice;

import java.util.Scanner;

public class StringReverser {

	public static void main(String[] args) {
		
		System.out.println("Enter a String");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String output = "";
		
		for(int i=input.length() - 1; i >= 0; i--){
			output += input.charAt(i);
		}
		System.out.println(output);
		
		//Using in built class or function to reverse a string.
		System.out.println(new StringBuffer(input).reverse());
		
		
		scanner.close();

	}

}
