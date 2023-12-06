package letCodeWithKoushik;

public class LearnStatic {
  //instance variable belongs to objects.
	// static varaible belongs to class.
	
	int x = 0;
	static int y = 0;
	void counter() {
		x++;
		y++;
		System.out.println("non-static " + x + "----------static : " + y);
		
	}
	public static void main(String[] args) {
		LearnStatic ls = new LearnStatic();
		ls.counter();
		LearnStatic ls1 = new LearnStatic();
		ls1.counter();
		
	}
}
