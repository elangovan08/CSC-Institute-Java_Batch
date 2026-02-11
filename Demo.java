import java.util.Scanner;
public class Demo
{
	Demo(){
		System.out.println("Default Constructor");
	}
	static int count=0;
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Demo obj=new Demo();
	//obj.fun();
	
	//obj.reverseTheString();
//oddAndEvenNumbers(sc); 
 //reverseTheNumbers();
 //fibno(sc);
}
void reverseTheString(){
	String name="Mathi";
	String reverse="";
	Scanner sc=new Scanner(System.in);
	for(int i=name.length();i>0;i--){
		reverse+=name.charAt(i-1);
   
	}
	System.out.println(reverse);
}
public static void reverseTheNumbers(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No: ");
		int no=sc.nextInt();
		while(no>0){
		System.out.println(no%10);
		no=no/10;
		}
	}
	static void oddAndEvenNumbers(Scanner obj){
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No: ");
		int no=obj.nextInt();
		if(no%2==0){
			System.out.println("Even number: "+no);
		}
		else
			System.out.println("Odd number: "+no);
	}
	static void fibno(){
		//using two variables 
		int i=0;
		int j=1;
		while(count<10){
			System.out.println(i); //0  1   1 
			j=i+j;   //0 1  1
 			i=j-i;   //1 0  
			count++;
		}
	}
		public void fun()
	{
		System.out.println("Fun in parent");
	}
}
/*
class Demo2 extends Demo{
	
	static void main(String args[]){
		Demo obj=new Demo();
		obj.fun();
	}
	void fun(){
		System.out.println("Fun in child");
	}
}*/

class Person {
    String name;

    void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int rollNo;

    void displayStudent() {
        displayInfo();
        System.out.println("Roll No: " + rollNo);
    }
}

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Amit";
        s.rollNo = 101;
        s.displayStudent();
    }
}



interface A {
    void methodA();
}

class B implements A {
    public void methodA() {
        System.out.println("A method implemented in B");
    }

    void methodB() {
        System.out.println("B method");
    }
}

interface C {
    void methodC();
}

class D extends B implements C {   // Hybrid inheritance
    public void methodC() {
        System.out.println("C method implemented in D");
    }

    void methodD() {
        System.out.println("D method");
    }
}
