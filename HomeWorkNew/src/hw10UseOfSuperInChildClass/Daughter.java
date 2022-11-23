package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super();
		super.familyName = "Hossain";
		System.out.println("This default constractuor from Daughter class");
	}

	public Daughter(String birthMonth, int age) {
		super("Hossain", 22, 'F', true);

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birthmonth: " + birthMonth + " Age: " + age);
	}
	
	public void daughter() {
		super.father();
		System.out.println("This void mathod from daughter class");

	}

	public void Daughterinfo(String birthMonth, int age) {
		super.Fatherinfo("Mohammed", 50, 'M', true);

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth month:" + birthMonth +", Age" + age);
	}
}
