package letCodeWithKoushik;

public class LearnConstructor {
	// constructor using for instance variable or method changing.
	
	public LearnConstructor() {
		this.x = 100;
	}
	public LearnConstructor(int x) {
		this.x = x;
	}
	public LearnConstructor(int x, String d) {
		this.x = x;
		this.name = d;
	}
   int x;
   String name;
   
   void display() {
	   System.out.println("x ---" + x + " name :-----" + name);
   }
	public static void main(String[] args) {
		LearnConstructor lc = new LearnConstructor();
		lc.display();
		LearnConstructor lc1 = new LearnConstructor(1000);
		lc1.display();
		LearnConstructor lc2 = new LearnConstructor(2000, "Mani");
		lc2.display();
		
	}
}
