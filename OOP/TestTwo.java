class TestTwo extends Test{

public TestTwo(){

	super("Mano");	 //to call parent Constructor
System.out.println("Child Constructor");
System.out.println();

}

public TestTwo(String name){

  this(name,11);
		  //to call parent Constructor
System.out.println("Child Constructor : "+ name );
System.out.println();

}
public TestTwo(String info , int c){

		  this();//to call parent Constructor
System.out.println("Child Constructor : "+info);


}
/*
Parent Constructor : Mano
Child Constructor

Parent Constructor : Mano
Child Constructor

Child Constructor : Vinoth
Child Constructor : Vinoth

Parent Constructor : Mano
Child Constructor

Child Constructor : java class

*/
public static void main(String []args){

TestTwo ts = new TestTwo();  //parent - child Constructor

TestTwo ts2 = new TestTwo("Vinoth"); //

TestTwo ts3 = new TestTwo("java class" , 55);

}

}