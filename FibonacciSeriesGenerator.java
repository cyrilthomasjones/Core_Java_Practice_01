package programming_practice;

import java.util.Scanner;

public class FibonacciSeriesGenerator {

	public static void main(String[] args) {
		
//		Always begins with Zero and one and the next number in the series becomes the sum of the previous 
//		two numbers (0 1 1 2 3 5 8 13 21 34)
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n1 = 0, n2 = 1, n3; 
		System.out.print(n1+" "+n2);
//		We start at 2 (i=2) because we have already printed 2 values out of the 10 (n1 and n2)
		for(int i=2; i<num; i++){
			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		sc.close();
		

	}

}
