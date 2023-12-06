package LetCodeOfOops;

public class Bike extends vehicle{
	
	public boolean hasDisc() {
		//System.out.println("");
		return true;
	}
	@Override
	public void applyBrake() {
		super.applyBrake();
		System.out.println("Bike --applied brake");
	}
}
