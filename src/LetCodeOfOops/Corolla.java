package LetCodeOfOops;

public class Corolla extends Bike {

	
	int mileage = 300;
	
	String getColor() {
		return "grey";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Corolla myCar = new Corolla();
		 int mymileage = myCar.mileage;
		 System.out.println(mymileage);
		 
		 myCar.getColor();
		 
		 //Bike obj = new Bike();
		 boolean disc = myCar.hasDisc();
		 System.out.println(disc);
		 
		 myCar.applyBrake();
		 
		 vehicle myV = new vehicle();
		 myV.applyBrake();
		 
	}

}
