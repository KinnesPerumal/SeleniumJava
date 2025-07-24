package learnJavaInheritance;

public class Bike extends Vehicle{
	
	public boolean hasDisc() {
		return true;
	}
	public void applyBrake(){
		super.applyBrake();
		System.out.println("Bike - Break Applied");
	}
}
