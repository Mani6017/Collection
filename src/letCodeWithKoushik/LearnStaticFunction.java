package letCodeWithKoushik;

public class LearnStaticFunction {
	
	int x = 8;
	static int y = 7;
         void eat() {
        	 System.out.println("im eating at dinner" + x + "-------" + y);
         }
         public static void sleep() {
        	 
			System.out.println("after dinner, im going to study" + y);
		}
         public static void main(String[] args) {
        	 LearnStaticFunction lf = new LearnStaticFunction();
        	 lf.eat();
        	 LearnStaticFunction.sleep();
        	 
        	 String a = "10";
        	 String b = "10";
        	 
        	int c = Integer.parseInt(a);
        	int d = Integer.parseInt(b);

        	System.out.println(c+d);
		}
}
