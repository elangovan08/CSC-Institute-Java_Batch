class Student{

int amount = 100000; //global variable

public static void main(String args[]){

Student arun = new Student();

arun.goToExam(10000);
//arun.goToExam("pen" ,"calci" ,"pencil");
//arun.goToExam("pen" ,"calci" ,"pencil" ,34);
Student obj = new Student();


obj.arun();

}

void arun(){
	//System.out.println(cash); //compile time error --->cannot find symbol or what is cash
}

void goToExam(int amount)
{  //local variable
	
	System.out.println(amount); //100000 
	
	
	
	//System.out.println("Here tamil exam");
	
}

void goToExam(String pen , String cal ,String pencil){
	System.out.println("Maths exam here");
}

void goToExam(String pen , String cal ,String pencil ,int num){
	System.out.println("Maths exam here");
}

}

//PolyMorphism -->

//method overloading ----->same method name with num of args or diff args

//method overriding --->same method name different actions or definitions 



//what is overLoading

//global and local variable 

//compile and runTime ?