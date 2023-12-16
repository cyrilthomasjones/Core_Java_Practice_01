package programming_practice;

import java.util.Scanner;

public class SumOfMultipleOf3 {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int digit, num = sc.nextInt(),sum = 0;
		
		while(num != 0){
			digit = num % 10;
		/* Main Logic
		 * check if each digit is divisible by 3 without remainder*/
			if(digit % 3 == 0){
				sum = sum + digit; 
			}
			num = num / 10;
		}
		System.out.println("Sum of digit is: "+ sum);
		sc.close();

	}

}
