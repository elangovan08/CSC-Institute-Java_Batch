class BranchOffice extends MainOffice{

public BranchOffice(){
	
	System.out.println("Child  doing some changes");

}

Child  doing some changes

ss23

single arguments constructor from child

hello ,23


public BranchOffice(String message){
	
	this("ss", 23); // to call current class constructor
	
System.out.println(message);
	
}

public BranchOffice(String message , int a){
	
	
	
System.out.println(message  +a);
	
}

public static void main(String args[]){

BranchOffice csm = new BranchOffice();

BranchOffice csm2 = new BranchOffice("single arguments constructor from child");


BranchOffice csm3 = new BranchOffice("hello" ,23);





}


void noArgs(){
	
}

void singleArgs(int s){
	
}

void twoArgs(String ss, int w){
	
	
}

}

//Inheritance -- an object of one class behaving as an object of another class

//Today class Topics 

//default constructor calling 

//super() this() - with arguments

//Constructor chaining

//Singleton design pattern (private Constructor)

//getter() setter()