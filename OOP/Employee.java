class Employee extends BO implements OfficeManagement, WipRoContract {
	
	
public static void main(String args[]){

 //int a = 23;

//BO arun = new Employee(); //class Dynamic Binding

Employee arun = new Employee(); //interface Dynamic Binding


//child
arun.testing();
arun.termsAndConditions();
//arun.goToJob();


arun.design();


//OfficeManagement.manage();

//arun.noOfLeave = 20;

//System.out.println(arun.noOfLeave);


//parent
/*
arun.provideDiscount();
arun.developing();
arun.byHO();
*/


}
public void wfh(){
	
}

public void test(){
	
}

public void design(){
	
	System.out.println("From design");
}

public void goToJob(){
	System.out.println("Doing program");
}


public void childDefinition(){
	System.out.println("From child class");
}

public void testing(){
	System.out.println("Testing application in Employee");
	
}

//parent method - override

public void provideDiscount(){
	System.out.println("Discount in Employee class");
}
public void develop(){
	
}


	
}

/*Branch3 is not abstract and does not override abstract method byHO() in BO
class Branch3 extends BO{
^
1 error*/