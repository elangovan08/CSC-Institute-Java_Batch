 package c1;
 
public class Market{

 String discount ="10% offer for all product" ; // 

//should be known offer to customer and it must not be modify by them

public String getDiscount(){  //getter() 
	
	return discount;  // getter() - for "access" the private field
}

public void setDiscount(String discount){  //setter()
	
this.discount = discount; //sette() - for "modify" the private field
	
}
int productPrice;

String brandName; 

//Singleton design pattern (private Constructor)

private Market(String brandName ,int productPrice){
	
	this.brandName = brandName;   
	this.productPrice = productPrice;  
	
}
public  Market(){
	
	System.out.println("Parent");
	
} 
 
//public - access in anywhere 
//default -same package 
//private - within the class 
//protected - to subclasses in another package or same package


public static void main(String args[])
{
  
Market chair = new Market("NNP" ,300);//Garbage collection
 
chair.sell();

chair.setDiscount("15% offer");

System.out.println(chair.discount);


} 
public void  sell(){

	System.out.println(brandName);

	System.out.println(productPrice);
}


}
//Today Discussion:


//Constructor Need  and this keyword

//differents b/w primitive and non primitive data types 

//Global and local variable

//type for variable and object reference (exp -> int a , Market chair)

// default value for global and local variable



//------------------------

//private Constructor

//getter() setter()

/*

Nov27 -Notes

1. Private Constructor:

A private constructor is declared using the private access modifier.

It prevents object creation from outside the class.

Used in classes where only one object should exist (Singleton design pattern).

Used to stop creating objects for utility classes (like Math class).

Object can be created only inside the same class.

Helps in controlling object creation and improving security.

------------------------------------------------------

2. Getter() and Setter():

Getter method is used to read or access private variables.

Setter method is used to modify or update private variables.

They help in achieving encapsulation.

Variables are kept private for data protection.

Getter returns the value of a variable.

Setter assigns a new value to a variable.

Naming follows a pattern: getName(), setName().

Used for validation before assigning values.


*/

//access modifier - private , default , protected , public


//class  - private , protected

//field

//method

//constructor  - special method