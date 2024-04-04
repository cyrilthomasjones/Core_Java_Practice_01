package strings;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class StringEndChecker {

	public static void main(String[] args) {
		// Take Character of first String starting from ending 
		
		//Compare first string character in second string
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String firstString = sc.nextLine();
		System.out.println("Enter second string");
		String secondString = sc.nextLine();
        System.err.println(firstString.endsWith(secondString) ? "String ends with second string" : "String does not end with second string");
		
		sc.close();

		/*
		 * int counter = 0;
		 * 
		 * // First Solution for (int i = firstString.length()-1, j =
		 * secondString.length()-1; j >= 0; i--,j--) { if(firstString.charAt(i) !=
		 * secondString.charAt(j)) { break; } counter++; }
		 * 
		 * if(counter == secondString.length()) {
		 * System.out.println("String ends with second string"); }else {
		 * System.out.println("String does not end with second string"); }
		 * 
		 * // Second Solution System.err.println(firstString.endsWith(secondString) ?
		 * "String ends with second string" : "String does not end with second string");
		 * 
		 * sc.close();
		 */
	}

}
