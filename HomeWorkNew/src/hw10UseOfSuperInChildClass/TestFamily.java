package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println(" \nDefault constructor is initialized here");
		Daughter daughter1 = new Daughter();

		System.out.println("\nParameterized constructor is initialized here");
		Daughter daughter2 = new Daughter("May", 12);

		System.out.println("\nVoid type method initialized here:\n");
		daughter2.father();

		System.out.println("\nParameterized method initialized here:\n");
		daughter2.Fatherinfo("Mohammed", 55, 'M', true);

	}

}
