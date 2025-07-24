package learnJavaInterface;

public interface RBI {
	
	int UPILimit = 1000000;
	
	void aadharMandatory();
	
	void aadharMandatory(boolean a);
	
	boolean panMandatory();
	
	default void housingLoan(){
		System.out.println("HousingLoan");
	}
	
	static void bikeLoan(){
		System.out.println("bikeLoan");
	} 
}  
