
class Calculator{

int c=34;    

public static void main(String []args ){
	
 Calculator arithmetic = new Calculator();  //Dynamics binding 

 int addValue = arithmetic.add(22,56);  //Method calling
 int subValue = arithmetic.sub(addValue ,43);   //How we can define a string " " 
double multiValue = arithmetic.multi(addValue, subValue);

arithmetic.tyoeCasting();

}

private int add(int num1 ,int num2 )  //parameter
{
	
	int c= num1+num2;
	return c;
}

private int  sub(int a ,int b){
	
	int c= a - b ;
			System.out.println("Subtration two values :"+ c);

return c;
}

private double multi( int add , int sub){
	
	double d= add*sub;
	
	return d;
	
}

private void tyoeCasting(){
	
	
	   int myInt = 10;
        double myDouble = myInt; // Automatic conversion from int to double
        System.out.println(myDouble); // Output: 10.0
	
	
	        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual conversion from double to int
        System.out.println(myInt); // Output: 9 (decimal part is truncated)
	
/*Widening Casting (Implicit/Automatic):

This occurs when converting a smaller data type to a larger data type.

Java performs this conversion automatically because there is no risk of data loss.

Order: byte -> short -> char -> int -> long -> float -> double. */



//TypeCasting ----> converting one dataType to another DataType

//double size -> 8 byte

//int size -> 4 byte
	
	
}

}








//Primitives 


//in java 8 primitive dataType

//Primitive dataType are fixed size

//primitive reference variable / fields /identifiers 


//Non Primitives  

//Varying size 


//What is compile time error 

   
//Demo.java  ---> Demo.class