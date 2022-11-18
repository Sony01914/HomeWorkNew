package hw3JavaVariables;

public class AboutMe {
	// Variable is declared
	public String carName;
	// Variables initializes

	public String nickName = "Sony";
	public Byte age = 126;
	public short myHouseRent = 1900;
	public int myYearlySalary = -2134232343;
	public long myCarPayment = 775656l;
	public float myAccountBalance = -3.3636363f;
	public double myPersonalExpenses = 3.2334433337;
	public char sex = 'M';
	public boolean usCitizen = true;

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();
		System.out.println("My name is " + aboutMe.nickName + ", my age is " + aboutMe.age);

	}

}
