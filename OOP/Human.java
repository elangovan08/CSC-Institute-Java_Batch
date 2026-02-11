package p1;

import p1.GrandHuman;

 public abstract class Human extends GrandHuman{

protected final int amount =100;   //----> field  --->static -->non static 

public static void main(String []args){

GrandHuman mano = new GrandHuman();

System.out.println(mano.amount);

//System.out.println("From Human one");

mano.natureFromGrandHuman();

mano.parentCar();

mano.parentCar2();
}

public abstract void parentCar2();

protected int  parentCar(){

//System.out.println(amount); //300

//System.out.println("This is parent car"); //300

System.out.println("From Human"); //300
 
 return 342;

}


}
/*
 * /A.class /B.class /C.class /CMDLine.class /D.class /DayOne.class /Demo.class
 * /OOP/ /Office.class /Person.class /Student.class /Test.class /coreThings/
 * /.project /Architectures/ /Bank.class /ExceptionClassHierarchy.webp /Java
 * Notes.txt /New Text Document.txt /Notes/ /TLC.jpg /Text.txt
 * /Thread_Life_Cycle.jpg /controlFlowStatement/ /fileHandling/ /test/ TLC.jpg
 * *.jpg *.png
 */