package LetCodeOfOops;

public interface Federalbank {
	
	int cashLimit = 10000;
	
         void id();
         void id(boolean A);

         boolean ssn();
          default void housingLoan() {
        	  System.out.println("ssn mandtory");
          }
          
          static void carLoan() {
        	  System.out.println("down payment required");
          }
}
