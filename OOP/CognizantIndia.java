 class CognizantIndia{

public static void main(String []args){

CognizantIndia india = new CognizantIndia();

//india.manage();

//india.manage("Managing With Teams");

//india.manage("Managing With Teams" , 10);

//india.develop();

}
/*public void develop(){
	System.out.println("Developing application by India");
}*/



//public abstract void demo();

public void manage(String message , int members)
{
	System.out.println(message +" : "+ members );
}
public void manage(String message)
{
	System.out.println(message);
}




public void automationTesting()
{
System.out.println("automationTesting From India");

}










public void readingNewsPaper(){
	
	System.out.println("Parent reading Tamil News paper");
}


public void buyingCar(){
	System.out.println("buying Benz");
}

}
/*
CognizantIndia.java:1: error: CognizantIndia is not abstract and does not override abstract method develop() in CognizantUS
class CognizantIndia extends CognizantUS{
^
1 error*/

/*
CognizantIndia.java:5: error: CognizantIndia is abstract; cannot be instantiated
CognizantIndia india = new CognizantIndia();
                       ^
1 error*/