package programming_practice;

import java.util.Scanner;

public class DigitCounter {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(),counter = 0;
		
		while(num != 0){
			counter++;
			num = num / 10;
		}
		System.out.println("Count of digit is: "+ counter);
		sc.close();

	}

}
