package udemy_logical_programming_practise;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
      try(Scanner sc = new Scanner(System.in);){
      int num = sc.nextInt();
      if(num <= 0){
//    	  System.out.println("Invalid number "+ num);
    	  throw new IllegalArgumentException("Invalid number "+ num);
    	  
      }else{
    	  if(num % 2 == 2){
    		  System.out.println("Even");
    		  
    	  }else{
    		  System.out.println("Odd");
    	  }
      }
	}
   }
	
/*	public static void main(String[] args) {
		System.out.println("Enter a number:");
		// Note to read on try with resource block
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			if (num <= 0) {
				System.out.println("Invalid number " + num);

			} else {
				// Main Logic
				if (num % 2 == 0) {
					System.out.println("Even");
				} else {
					System.out.println("Odd");
				}

			}
		} catch (IllegalArgumentException e) {
			System.out.println();

		} finally {
			scanner.close();
		}
		}
		*/
}
