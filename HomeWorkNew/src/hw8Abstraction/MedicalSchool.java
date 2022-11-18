package hw8Abstraction;

public abstract class MedicalSchool {
	public MedicalSchool() { // Constructor can be created in the abstract class

	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is non abstract method");

	}

}
