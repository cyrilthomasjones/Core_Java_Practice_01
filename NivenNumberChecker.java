package programming_practice;

import java.util.Scanner;

public class NivenNumberChecker {

	public static void main(String[] args) {
		
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
