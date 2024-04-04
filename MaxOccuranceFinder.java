package strings;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class MaxOccuranceFinder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String input = sc.nextLine();
		// Declare int arr[256]
		int[] arr = new int[256];

		// use ASCII val of the character as index and increase the count
		for (int i = 0; i < input.length(); i++) {
			arr[input.charAt(i)]++; // Note to loop only through the user input you had 
		}

		// Check for Max
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				max = i; // Note I want the index, I don't want the count value
			}
		}
		System.out.println("Max: " + (char) max);
		sc.close();

	}

}
