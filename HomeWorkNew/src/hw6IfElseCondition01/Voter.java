package hw6IfElseCondition01;

public class Voter {

	public static void main(String[] args) {
		int age = 30;

		if (age == 18) {
			System.out.println("Im a votar");

		} else if (age < 18) {
			System.out.println("Im not a votar");

		} else if (age > 18) {
			System.out.println("Im a votar");

		} else {
			System.out.println("Plese add a valid age");

		}

	}

}
