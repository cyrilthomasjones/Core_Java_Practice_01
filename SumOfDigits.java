package udemy_logical_programming_practise;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int digit, num = sc.nextInt(), sum = 0;
		
		while(num!=0){
			digit = num % 10;
            sum = sum + digit; 
			num = num / 10;
		}
		System.out.println("Sum of digits is: "+ sum);
		sc.close();

	}

}
