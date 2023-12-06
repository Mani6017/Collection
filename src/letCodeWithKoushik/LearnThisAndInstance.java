package letCodeWithKoushik;

public class LearnThisAndInstance {
     
	 int d; // Instance variable.
	
	int num(){
		return 1;
	}
	void addSumNumbers(int a, int b) {
		int c = 76; // local variable must be initialize
		System.out.println(this.d);
		System.out.println(a+b+c+this.num());
	}
	
	public static void main(String[] args) {
	
		LearnThisAndInstance lt = new LearnThisAndInstance();
		lt.addSumNumbers(4, 34);
	}
	
}
