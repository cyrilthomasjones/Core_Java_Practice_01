package strings;

import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		String input = sc.nextLine();
		int count = 0;

		//First solution using the split function 
		System.out.println(input.split(" ").length);

		/* Another solution is using the Character class
		 This class has isWhitespace method */
		
		for (int i = 0; i < input.length(); i++) {
			if (Character.isWhitespace(input.charAt(i))) {
				count++;
			}
		}
		System.out.println(count + 1);

	}

}
