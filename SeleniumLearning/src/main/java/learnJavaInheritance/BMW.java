package learnJavaInheritance;

public class BMW extends Bike {
	int mileage = 20;
	
	String getColor(){
		return "red";
	}
	
	public static void main(String[] args) {
		BMW myBike = new BMW();
		System.out.println(myBike.getColor());
		int milage = myBike.mileage;
		System.out.println(milage);
		
		boolean hasDisk =myBike.hasDisc();
		
		myBike.applyBrake();
		
		Vehicle myv=new Vehicle();
		myv.applyBrake();
		
		
	}
}
