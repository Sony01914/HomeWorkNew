package hw10UseOfSuperInChildClass;

public class Father {

	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("This is default constractuor from father class");

	}

	public Father(String name, int age, char sex, boolean usCitizen) {

		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + name + ", Age: " + age + ", Sex " + sex + " Uscitize " + usCitizen);
	}

	public void father() {
		System.out.println(" This mathod from father class");
	}

	public void Fatherinfo (String name, int age, char sex, boolean usCitizen) {

		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + name + ", Age: " + age + ", Sex " + sex + " Uscitize " + usCitizen);
	}
}
