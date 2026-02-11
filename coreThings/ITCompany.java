class ITCompany{


//What is class:

//A class is a blueprint or template that defines how objects will look and behave.

//It describes what data (variables) and what actions (methods) its objects will have.



// static String companyName="Accenture";  -----?

//class specific information (variable) or

//static variable

//Def :Only one copy exists in memory (no matter how many objects are created).


String emplName;    
int emplAge; 

//String emplName; ----?
 
//instance variable or

//non static varibale or 

//object specific variable

public ITCompany(String name ,int age){
	
	this.emplName = name;        //Constructor Definition or Body
	this.emplAge =age;
	
}
 public void doProgramming(String name , int age)
 {
	 
	 System.out.println(name + " : employeeOne doing programmer");
 }
	 

public static void main(String args[]){

ITCompany employeeOne = new ITCompany("suresh" , 25); //Constructor calling 
ITCompany employeeTwo = new ITCompany("john" ,30);
ITCompany employeeThree = new ITCompany("kathir" ,32);


ITCompany employeeThree = new ITCompany(); //Default Constructor calling

employeeOne.emplName="Neo";
employeeOne.emplAge=25;    

          //what is object -->states(Variable(Fields)) and behaviours(Methods) 
		  //               -->memory reference in class
		 //	       		   -->object represent class
		//				   -->Object representative of class	
	   //				   -->Collection of objects	

//An object is an instance of a class that represents real-world entities with states (variables/fields) and behaviors (methods).	   


	System.out.println(employeeOne.emplName + " : employeeOne doing programmer");
	System.out.println(employeeTwo.emplName + " : employeeOne doing programmer");	

	//-->object representative of class	

//employeeTwo.emplName="john";
//employeeTwo.emplAge=30;
									//what is method --> 
									
									//set of instructions with a name / block of codes or statements

									//int d = 44;  //statement			

//employeeThree.emplName="kathir";   
//employeeThree.emplAge=32;


//employeeOne.doProgramming(emplName , emplAge ); //method calling   

}


}


/*
C:\Users\Elangovan\Desktop\CSC_JAVA_BATCH>javac ITCompany.java
ITCompany.java:18: error: constructor ITCompany in class ITCompany cannot be applied to given types;
ITCompany employeeOne = new ITCompany("suresh" , 25); //Constructor calling
                        ^
  required: no arguments
  found:    String,int
  reason: actual and formal argument lists differ in length
ITCompany.java:19: error: constructor ITCompany in class ITCompany cannot be applied to given types;
ITCompany employeeTwo = new ITCompany("john" ,30);
                        ^
  required: no arguments
  found:    String,int
  reason: actual and formal argument lists differ in length
ITCompany.java:20: error: constructor ITCompany in class ITCompany cannot be applied to given types;
ITCompany employeeThree = new ITCompany("kathir" ,32);
                          ^
  required: no arguments
  found:    String,int
  reason: actual and formal argument lists differ in length
3 errors

*/