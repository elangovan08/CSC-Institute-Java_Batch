package controlFlowStatement;

public class CustomException {

	public static void main(String[] args) {

		int age = 16;

		try {

			if (age < 18) {

				throw new AgeException("Age must be above 18");

			}
		} catch (AgeException ae) {

			System.out.println(ae.getMessage());
		}
		// ageChecking(age);

	}
}
