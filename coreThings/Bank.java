class Bank{


//static -- class specific information 

static String className = "Class name is Bank ";  

											
											//field ---> static ,non static 

String message ="Hello world"; //Global variable    


 int emplHeight = 170;   //non static variable //object specific variable //instance variable
 
 
 public static void reduce_Interest_For_Loan(String interest)  //parameter 
{
	 
	 int gg= 54;
	 
	 System.out.println( "reducing interest for all loan");
	 
 }

public static void main(String args[])  //Entry point 

{  

 Bank newEmployee = new Bank();  //newEmployee ---> Reference variable or object name 

//newEmployee.givingLoan();  //method calling     //Statement 


//reduce_Interest_For_Loan("10%"); //class specific method   //method arguments 

int s =43; 

//System.out.println(ff); 

//System.out.println(newEmployee.className); 


}

public void givingLoan() //method Signature  //object calling method 
{
									//Set of instructions with a name 
	
	int ff =43;  //Local variable
	
	System.out.println("Giving loan for an customer with them property");
															
	System.out.println(className);    //Method body or Definintion 
	System.out.println(emplHeight);	// what is method - Block of codes or Statement 
}



//static -- class specific information 
							

}

 //what is object --> States and behaviours 

					// object  --->   Memory reference in a class 
					
					//States --> dob ,height ,weight ,data of joining  ---> Variables (Details)
					
					// String dob = "23/05/2000"  String name = "John"  int weight =55
					
					//Behaviours --> activity ---> action ---> methods   



           ()