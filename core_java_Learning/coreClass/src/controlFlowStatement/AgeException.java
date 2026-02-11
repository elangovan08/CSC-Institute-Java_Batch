package controlFlowStatement;

import java.util.Scanner;

//Custom or user developing exception

public class AgeException extends Exception {

	public AgeException(String f) {

		super(f);

		// getMessage();

	}

	public static void main(String[] args) {

		ageCheking();

	}

	private static void ageCheking() {

		Scanner ss = new Scanner(System.in);

		System.out.println("Enter your Age : ");

		int age = ss.nextInt(); // 12

		if (age < 18) {

			try {

				throw new AgeException("given age is not eligible : "); // manual exception handling by throw

			} catch (AgeException a) {

				System.out.println(a.getMessage() + age);

				ageCheking();

			}
		}

		if (age >= 18) {

			System.out.println(age + " is eligible for vote ");

		}

	}

}

//try , catch , finally , throws  ,throw ,try with resource
