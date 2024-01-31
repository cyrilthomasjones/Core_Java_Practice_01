package programming_practice;

import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();//Use nextLine() instead of next() to consider anything after first space character
		int count = 0; 
		
		for (int i = 0; i < input.length(); i++) {
			if(Character.isWhitespace(input.charAt(i))){
				count++;
			}
		}
		System.out.println(count+1); // We include (count+1) this to include the last space or word 
		sc.close();
	}

}
