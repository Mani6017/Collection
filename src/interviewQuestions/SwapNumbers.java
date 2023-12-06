package interviewQuestions;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mySalary=20;
		int superiorSalary=50;
		
		System.out.println("Before swapping: " + " mine salary " + mySalary + " and Superior Salary " + superiorSalary);
		int temp=mySalary;
		mySalary=superiorSalary;
		superiorSalary=temp;
		System.out.println("After swapping: " + " mine salary " + mySalary + " and Superior Salary " + superiorSalary);


	}

}
