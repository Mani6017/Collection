package interviewQuestions;

import java.util.Scanner;

public class reverseNumbers {
	 
     
     
	public static void main(String[] args) {
        
		int given = 0;
	     int reversedNumber = 0;
	     
	     System.out.println("Enter the number");
	     Scanner j = new Scanner(System.in);
	     given = j.nextInt();
	     j.close();
         
         while(given != 0) {
         reversedNumber =  reversedNumber * 10;
         reversedNumber = reversedNumber + given%10; // reversedNumber = 3
         given = given/10;
         }
         System.out.println(reversedNumber);
         
	}

}
