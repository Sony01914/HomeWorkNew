package hw5Q3Constructor;

public class Student {
	public String stName;
	public Integer stID;
	public char sex;
	public Boolean isProgrammer;
	public float grade;

	public Student() {// Default constructor is declared here
		System.out.println("This is from default Constructor of Computer class.");

	}

	public Student(String stName, Integer stID, char sex, Boolean isProgrammer, float grade) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student name is " + stName + ", Student Id " + stID + ", My sex " + sex + ", Programmer "
				+ isProgrammer + ", My grade" + grade);
	}

}
