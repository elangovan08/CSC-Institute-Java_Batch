class GrandChild extends Child{


String name ="Anu";

public static void main(String args[]){

GrandChild gc = new GrandChild();

gc.parentAsset(); //method calling 
 System.out.println(); //
gc.childMethod();
System.out.println(); 
gc.grandChildMethod();

System.out.println(gc.ss);

}

public void grandChildMethod(){
	
	 System.out.println("This is about Grandchild property");
}


}
