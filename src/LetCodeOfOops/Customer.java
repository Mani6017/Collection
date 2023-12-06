package LetCodeOfOops;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BOITN sh = new BOITN();
//		sh.
		
         Chase myBank = new Chase();
         myBank.id();
        boolean status =  myBank.ssn();
        System.out.println(status);
        myBank.interestFreeLoan();
        System.out.println(Chase.cashLimit);
        
        Federalbank mypnc = new Chase();
        mypnc.housingLoan();
        Federalbank.carLoan();
	}

}
