import pkg1.ParentClass;

class ChildClass extends ParentClass{
 
public static void main(String args[]){
 
//ChildClass cc = new ChildClass();
 
// ParentClass cc = new ChildClass();  //Dynamic Binding
 
 //By parent
// cc.goByCar(); 
 //cc.selectionCourse();
 
 //child class
 //cc.goToWork();
 
 //ParentClass pc = new ParentClass();
 
ChildClass cc = new ChildClass();

cc.goToWork();
 
 System.out.println(cc.a);
 
}
/*public void goToWork(){

System.out.println("Going to work - do programming");

}*/

public void goByCar(){
System.out.println("Driving car");

}

public void selectionCourse(){

System.out.println("Select course with own idea");
}

 
 }
 