class Office{

 final int number =34;  //once we assigned we can't Reassigned again anywhere in class or out class  


static String officeName="TCS Company";   //static (class specific information)

String name= "mano";  //non static variable (object specific information)   //field
int age=25; 

public static void main(String args[]){

Office developer =new Office();

developer.doProgramming(); 

  
party();  //class specific information(class defined method or calling) 

printOfficeName();

}

 public static void party(){
	
	System.out.println("Arranging party for all employees ");
	//System.out.println(name); 
	
}

public void doProgramming(){
	
	//number =45;
	
	//System.out.println("Developing Application");
	//System.out.println(officeName);
	officeName ="Accenture";	
}

static void printOfficeName(){
	System.out.println(officeName); 
}


}


//non static variable 
//object specific information
//instance specific information 