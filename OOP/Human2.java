package p1;

import p1.Human;

public class Human2 extends Human{

public static void main(String []args){

Human h2 = new Human2();

//h2.childCar();

 h2.parentCar(); 

//h2.natureFromGrandHuman();

}

public void natureFromchild(){

System.out.println("From Human Two");


}

public int  parentCar(){

//System.out.println(amount); //300

System.out.println("From Human2"); //300

//System.out.println("This is parent car"); //300
 
 return 342;

}


}

//Inheritance --> single inheritance

//            --> MultiLevel inheritance


//Parent class //BaseClass  //SuperClass


//Child class //DerivedClass  //SubClass
 



//Encapsulation --? Data Binding 
 
//public --> access in anywhere

//private --> within the class  

//protected --> access for subClasses in another or same package 

//Default -->within the same package




















//Object creation in another class 

//public , private with methods and variable 

//package and import implementation 
