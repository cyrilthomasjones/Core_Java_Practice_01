package programming_practice;

import java.util.Scanner;

public class IntegerToBinary {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        // You don't need a digit, You need to store number in an array
		int[] binaryNum = new int[10];
		int i = 0;
		
		while(num!=0){
			// Store remainder in the array
			binaryNum[i] = num % 2;
			// num is the quotient used for loop constraint (comparison ==> num!=0)
			num = num / 2;
			// Increment i because it is used to store every value in an array
			i++;
		}
		
		// Next print the remainder store in the array in reverse order.
		for(int j = i-1; j>=0; j-- ){
			System.out.print(binaryNum[j]);
		}
		sc.close();
		
		
	}

}
