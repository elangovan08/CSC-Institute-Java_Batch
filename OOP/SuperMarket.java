class SuperMarket{

static String shopName= "MVM SuperMarket";

public int num =32;

String prodName;   //null
int price;  //0

String name ="Arya";

//name ="Divyesh";


public static void offerForAllProduct()
{
	
	System.out.println("10% offer for all product");
	
}

public static void changingShopName(){
	
SuperMarket.shopName= "Tvm SuperMarket";
System.out.println(shopName);  

}

public SuperMarket(){
	
}

public SuperMarket(String prodName ,int price){
	this.prodName = prodName; //null  //null  //null
	this.price = price; //0  //0  //0
	
	System.out.println("Constructor calling"); 

	
}

public static void main(String [] args)
{

SuperMarket soap = new SuperMarket("Hamam" ,30 );  //Constructor calling   
SuperMarket bread =new SuperMarket("ABC" ,20);
SuperMarket biscuit =new SuperMarket("MarieGold" ,15);

//soap.demo();  //method calling                       //();

//changingShopName();

//offerForAllProduct();  //Class specific method 

System.out.println("Soap name :"+ soap.prodName);

System.out.println("Biscuit price :"+ biscuit.price); 

//typeCasting(); 

}

public static void typeCasting(){
	
	//Converting one DataType to Another DataType 
	
	int s= 34;  //4 byte
	double d= s;  //8 byte
		System.out.println(d);   //34.0
	
    double v= 45.2;
	int a=(int) v;	
	
	System.out.println(a);   //45
		
}



}

//java Environment Setup?

//java Features?

//jdk jre jvm ?

//class ,object ,method

//dataTypes  ,variable

//TypeCasting

//returnData type ,arguments ,parameter

//what is static keyword  

//non static access? 

//what is Constructor ,Constructor calling

//Constructor overLoading 

//final keyword 

//this keyword

//PolyMorphism -->method overLoading?

//global and local variable ?

//compile and runTime error?

//what is  package and import 



//Encapsulation --? Data Binding 
 
//public --> access in anywhere

//private --> within the class  

//protected --> access for subClasses

/*





*/

//byte---->short---> int --> 


//typeCasting (Widenning and Narrowing)  


