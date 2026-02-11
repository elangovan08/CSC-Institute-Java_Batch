package controlFlowStatement;

import java.util.Scanner;

public class ConditionClass {

	public static void main(String[] args) {
		
		
		//loop   - for ,while ,do while  - enhanced for loop  //forEach()
		
		//value initializing ; condition ; increment decrement  
//		
//		int i =0;
//		
//		for(;i<10;i++ ) {
//			if(i==5) {
//				//break;
//				//continue;
//			}
//			System.out.println("Hello world : "+i);
//		}
		//while
//		
//		int s =0;
//		
//		while(s<=10) {
//			System.out.println("By while :" +s);
//		
//			s++;  //preCrement //postIcrement  - s++;
//		}
		
		//do while
		
//		int c =5;
//		
//		do{
//			System.out.println("By do while loop : "+c);
//			c++;
//		}while(c<=5);
//		
		
		//switch case
		
	Scanner scan = new Scanner(System.in);
	
	ConditionClass name = new ConditionClass();
	
	
	int a =12;
	
	a+=a; //24
	
	//compound assignment operator
	
	int b =11;
	if(a!=b) {
		
	} 
	else {
		
	}
	
//	
	//int num1 = scan.nextInt(); //5 
//	int num2 = scan.nextInt(); //10
//	
//	int total =num1+num2; //15
	
	//System.out.print("Enter day : ");
	
	// String day = scan.nextLine();

	 System.out.print("Enter first number : ");
	// int a = scan.nextInt();
	 System.out.print("Enter second number : ");
	// int b = scan.nextInt();
	 
	 System.out.print("Enter your choice : ");
	 int choice = scan.nextInt(); //2
	 switch(choice) {
	 case 1:
		 System.out.println(a+b);
		 break;
	 case 2:
		 System.out.println(a-b);
		 break;
	 case 3:
		 System.out.println(a*b);
		 break;
	 case 4:
		 System.out.println(a/b);
		 break;
	default:
	    System.out.println("Enter only given case choice or it's invalid data");
	 
	 }
//	case "Sunday":
//		 System.out.println("WeekEnd");
//		 break;
//	 case "Monday":
//		 System.out.println("Week day");
//		 break;
//	 case "Tuesday":
//		 System.out.println("Week day");
//		 break;
//	default:
//		System.out.println("Invalid data");	
		
		
		//if else  //else if
				//nested if 
//		
//		int mark1 =90;
//		int mark2 =75;	
//		int mark3 =70;
//
//		if (mark1 >= 90)
//		{
//			if (mark2 >= 80) {
//				if (mark3 >= 70) {
//					System.out.println("Good score");
//				} else {
//					System.out.println("Average mark");
//				}
//			} else {
//				System.out.println("Good");
//			}
//		} else {
//			System.out.println("Grade fail");
//		}
//		
	}

	
	
}
