package programming_practice;

import java.util.Scanner;

public class NivenNumberChecker {

	public static void main(String[] args) {
		
/*		Logic
		===========================
		If a number is divisible by the sum of digit within that number, then it is a niven 
		number. It is when we add all the digits in a given number and devide the 
		number with the sum of those digit the remainder should be zero(0).

		All the single digit numbers are niven numbers because, 1%1 = 0, 2%2=0, 9%9=0 and so on.

		For 2 digit, here is an example of Niven numbers
		=================================================

		10%(1+0) = 0, 12%(1+2) = 0, 18%(1+8) = 0, 20%(2+0) = 0, 21%(1+2) = 0 */
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(num%sum(num)==0?"Niven Number":"Not Niven" );
		sc.close();
	}

	private static int sum(int num) {
		int digit, sum = 0;
		
		while(num!=0){
			digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		return sum;
	}

}
