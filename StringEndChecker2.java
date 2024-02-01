package programming_practice;

import java.util.Scanner;

public class StringEndChecker2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String s1 = sc.nextLine();//Use nextLine() instead of next() to consider anything after first space character
		System.out.println("Enter Second String");
		String s2 = sc.nextLine();
		
		System.out.println(s1.endsWith(s2)? "YES" : "NO");

		sc.close();
	}

}
