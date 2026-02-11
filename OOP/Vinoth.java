final class Vinoth implements WipRoContract {

public static void main(String args[]){

Vinoth engineer = new Vinoth();

//WipRoContract wc = new WipRoContract();

engineer.test();

engineer.developing();
//engineer.noOfLeave = 20;

engineer.termsAndConditions();

WipRoContract.manage();

System.out.println(engineer.noOfLeave); //20

}

public void design(){
	
	System.out.println("Vinoth Design");
	
}
public void test(){
	
	System.out.println("Application Testing");
	
}
public void wfh(){
	
	System.out.println("Vinoth From Home");
	
}

public void developing(){
	
	System.out.println("Vinoth Developing Application");
}

}



// lion is an animal
 

//extends  -- is a ---> relationship (Inheritance)


//implements  -- has is ---> relationship (interface)