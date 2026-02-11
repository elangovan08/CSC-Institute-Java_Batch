class Tamils implements IndianSystem {//, WipRoContract {

//class Tamils extends Indian implements IndianSystem

public static void main(String args[]){

//Indian t = new Tamils();  //Dynamic Binding

IndianSystem t = new Tamils(); //Dynamic Binding

//t.readingNews();

t.sportsFunction();

IndianSystem.managingFunc();

t.indianFood();

//parent
//t.forFinal();
//t.indianCulFunction();

//child
//t.doProgram();


//t.readingNews();

//System.out.println(t.ss);

//t.ss = 20;


//IndianSystem is = new Tamils(); //Dynamic Binding

/*
t.indianFood();
t.celebrate();
t.election();
*/
}
public void readingNews(){
	System.out.println("V news");
}

public void doProgram(){
	
	System.out.println("Doing program");
}

public void indianCulFunction(){
	System.out.println("Celebrating with all states culture in child");
}

public void forFinal(){
	System.out.println("From parent");
}


public void election(){
	
}

public void indianFood(){
	System.out.println("Indian Food");
}

public void celebrate(){
	System.out.println("Indian culture celebration");
}/**/


/*
public void managingFunc(){}



*/

}