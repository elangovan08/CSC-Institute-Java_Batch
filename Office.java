class Office{

static int emplAge; //0
String emplName; //null

int emplSalary;

public Office (String emplName ,int Age ,int Salary){
	
	emplName = emplName;  //Arun   //Yash   //
	emplAge = Age;  //24   //25 
	
	emplSalary=Salary;
}

public Office (String emplName ,int emplAge){
	
	this.emplName = emplName;  //Arun   //Yash   //
	this.emplAge = emplAge;  //24   //25 	
}
public static void main(String []args){

 Office emplOne = new Office("Arun" ,24); // Constructor calling
 
 
  Office emplTwo = new Office("Yash" ,25 ,40000);
  
 System.out.println(emplOne.emplName); //Arun
  System.out.println(emplTwo.emplAge);//25
  
  
   System.out.println(emplTwo.emplSalary);//40000
   
   
emplOne.developing("Hello developer" , 101); //method calling

emplOne.developing("Hello developer" , 101);
emplOne.developing("Hello developer" , 101);
emplOne.developing("Hello developer" , 101);
emplOne.developing("101"); 
}

void developing(String message){
	
//	System.out.println(message);
	
}

void developing(String message ,int num){
	
	System.out.println(message);
	
}

}
//what is Constructor

//what is this keyword 

//Constructor overLoading 





//PolyMorphism


//many form ---->

//method overloading ---- same method name with diff arguments or parameter 

//method overriding ---> same method name with diff definition or actions 








//jdk jre jvm ?

//class ,object ,method

//dataTypes  ,variable

//TypeCasting

//returnData type ,arguments ,parameter

//what is static keyword  (Class specific information)

//non static variable  (Object specific information)

//Constructor ,Constructor calling(For assigning object specific values or To corresponding object )

//final keyword (Constant value)

//this keyword(which is representing corresponding object)
