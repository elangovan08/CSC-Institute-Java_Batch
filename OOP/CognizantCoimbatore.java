class CognizantCoimbatore extends CognizantIndia{

public static void main(String []args){

CognizantCoimbatore cc = new CognizantCoimbatore();

cc.test();
cc.test(22 , 66,"John");

cc.test("With Selenium Automation testing tool");


//cc.demo();

//cc.develop();

cc.automationTesting();

}
public void readingNewsPaper(){
	
	System.out.println("Child reading English news paper");
}

public void buyingCar(){     
	System.out.println("BMW");
}


public void automationTesting()   //method override 
{
System.out.println("automationTesting From Coimbatore");

}

public void develop(){
	System.out.println("develop for US ");
	
}
public void demo(){
	
	System.out.println("Demo for india ");	
}

public void test(){
System.out.println("Testing here");

}

public void test(String tool){
System.out.println("Testing here "+tool);

}

public void test(int a ,int b ,String testerName){
System.out.println("Testing here with "+testerName);

}

}
/*
CognizantCoimbatore.java:1: error: CognizantCoimbatore is not abstract and does not override abstract method demo() in CognizantIndia
class CognizantCoimbatore extends CognizantIndia{
^
1 error


CognizantCoimbatore.java:1: error: CognizantCoimbatore is not abstract and does not override abstract method develop() in CognizantUS
class CognizantCoimbatore extends CognizantIndia{
^
1 error
*/


