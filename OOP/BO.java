abstract class BO implements OfficeManagement, WipRoContract{


public static void main(String args[]){

//BO ho = new BO();

//ho.provideDiscount();

//ho.manage();

}


public void provideDiscount(){
	System.out.println("Discount in child");
}

public void developing()  //method overriding 
{
	
	System.out.println("Divyesh Developing Application");
}

public void byHO(){
	
}

}

//my child must be define my abstract method  --MUST  // CAN 