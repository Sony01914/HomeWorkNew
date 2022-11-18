package hw4JavaVariables;

public class AboutMe {
	// variable is declared here.
	public String nickName;
	public Byte age;
	public short myHouseRent;
	public int myYearlySalary;
	public long myCarPayment;
	public float myAccountBalance;
	public double myPersonalExpenses;
	public char sex;
	public boolean usCitizen;

// constructor is declared here.
	public AboutMe() {
		System.out.println("This is all about us\n");
		

	}

	public void aboutMe() { // method is implemented here.
		System.out.println("My nickname is " + nickName + "\nMy age is " + age + "\nMy rent " + myHouseRent + "\nMy salary "
				+ myYearlySalary + "\nMy payment " + myCarPayment + "\nMy bank balance " + myAccountBalance
				+ "\nPersonal expenses " + myPersonalExpenses +"\nMySex " + sex + "\nUsCitizen " + usCitizen);

	}

}
