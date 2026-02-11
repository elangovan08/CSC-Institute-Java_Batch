class Home{


public static void main(String []args){  //main method entry point in java 


//Object --> States and behaviour  ---> Memory reference in class 

Home robot = new Home(); 

    int balanceAmount =robot.buyMeSomething(200);  //method calling 

	
System.out.println("Balance amount :"+ balanceAmount); 

//Parameter and arguments 


}

private int buyMeSomething(int amount)  //method signature
{
	int dd= 34;

	System.out.println("Buying some snacks for "+ amount);  //method body or definition 
	 int balance = amount-100; //100
	


	 return 23; //100
}

private void doSomething(){
	System.out.println("Do something ");

}


}


//Arguments and parameter with values

//ReturnType  - void  ,int ,double ,String

//TypeCasting - Converting one dataType to another DataType

//Widening - byte -> short -> char -> int -> long -> float -> double.

//Narrowing - double -> float -> long -> int -> char -> short -> byte.