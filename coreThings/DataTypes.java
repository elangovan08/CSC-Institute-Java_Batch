class DataTypes {

public static void main(String []args)
{

//one bit -  value of either 0s or 1s 

//collection of 8 bits are one byte 

//int size - 4 bytes 


// In Java, there are two types of data types
// 1. Primitive Data Types
// 2. Non-Primitive Data Types

//-------------------------------
// Primitive Data Types
//-------------------------------
// There are 8 primitive data types in Java
// byte, short, int, long, float, double, char, boolean

byte a = 100;               // byte stores small numbers (-128 to 127)
short b = 30000;            // short stores a little bigger number
int c = 2000000000;         // int stores large numbers (4 bytes)
long d = 21474836473L;      // long stores very large numbers (8 bytes)
float e = 10.5f;            // float stores decimal values (4 bytes)
double f = 20.123456;       // double stores decimal values (8 bytes)
char g = 'A';               // char stores a single character
boolean h = true;           // boolean stores only true or false

System.out.println("byte value: " + a);
System.out.println("short value: " + b);
System.out.println("int value: " + c);
System.out.println("long value: " + d);
System.out.println("float value: " + e);
System.out.println("double value: " + f);
System.out.println("char value: " + g);
System.out.println("boolean value: " + h);


//-------------------------------
// Non-Primitive Data Types
//-------------------------------
// Non-primitive types are created by the programmer
// These include String, Array, Class, Interface, etc.

String message = "Hello Students, Welcome to Java!";
int[] marks = {90, 80, 70, 60, 50};   // Array example

System.out.println("String value: " + message);
System.out.println("Array value (3rd element): " + marks[2]);

}

}


/* Primitive Data Types – These are the basic types already built into Java.

They directly hold values in memory (like numbers or characters).

--------------------------------------------------------------------------------------
Non-Primitive Data Types – These are created by the programmer.

They can store multiple values or objects and have methods.
Examples: String, Array, Class, Interface, etc */




//Variable naming rules:

/*

1) A variable must start with a letter (A–Z or a–z), underscore (_)
or dollar sign ($).

Example:
age, _name, $salary   (correct)

2) It cannot start with a number.
 
 Example: 1number (wrong)

 Example: number1 (correct)
3️)It can contain letters, numbers, underscore, or dollar sign only.
 
 Example: student-name (wrong because of -)
 Example: student_name or studentName

4️) Variable names are case-sensitive.
 
 Name and name are two different variables.

5️) No spaces are allowed in variable names.

Example: student name (wrong)
Example: studentName (correct)

6️)Variable name should not be a Java keyword.

Example: int int = 10; (wrong)

*/
class VariableExample {


public static void main(String[] args) {

// correct variable names
int number1 = 100;
String studentName = "Vinoth";
float salary_amount = 25000.50f;

// incorrect ones (if you try these, it will show an error)
// int 1num = 5;        ❌ starts with a number
// int class = 10;      ❌ class is a keyword
// int student name = 20; ❌ contains space

System.out.println("Number: " + number1);
System.out.println("Student Name: " + studentName);
System.out.println("Salary: " + salary_amount);
}
}
