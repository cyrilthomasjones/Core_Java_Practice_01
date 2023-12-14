package udemy_logical_programming_practise;

import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
//		Logic
//		========================
//		year%4==0 and year%100!=0;
//		Year%400 == 0; 
//		Leap         Not A Leap Year
		
		System.out.println("Enter a year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			System.out.println("Leap year");
		}else{
			System.out.println("Not a Leap year");
		}
		sc.close();
	}
// Test 1900, 2100, 2000
}
