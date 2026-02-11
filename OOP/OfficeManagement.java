interface OfficeManagement{

int noOfLeave = 10; //final int noOfLeave =10;

public final abstract void testing();  //public final abstract

public void develop();

public default void termsAndConditions()
{
		System.out.println("Wipro Company terms And Conditions");
}

public static void manage(){
		System.out.println("Wipro Company management");

}
public static void main(String args[]){
	
	
	//OfficeManagement manage = new OfficeManagement();
	
	//manage.termsAndConditions();
	
	OfficeManagement.manage();
}



}
//final variable cannot be modify

//final method cannot be override

//final class cannot be inherit






//interface?  

// interfaces are such contracts.

//interface -- is a set of rules 

//group of related method with empty body

// similar to a class, that can contain only constants,
// method signatures, default methods, static methods, and
// nested types.


//interface is abstract --- before java 8 is fully abstract(100%)

//interface is public // abstract

//interface values are final 

//Method bodies exist only for default methods and static methods. 
//Interfaces cannot be instantiated
//they can only be implemented by classes or extended by other interfaces.
