package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe aboutMe1 = new AboutMe(); // Constructor is initialize here.
		// Variable initialized here.
		aboutMe1.nickName = "Sony";
		aboutMe1.age = 127;
		aboutMe1.myHouseRent = 2312;
		aboutMe1.myYearlySalary = -3224324;
		aboutMe1.myCarPayment = 3422l;
		aboutMe1.myAccountBalance = -40384f;
		aboutMe1.myPersonalExpenses = 505858;
		aboutMe1.sex = 'M';
		aboutMe1.usCitizen = false;

		aboutMe1.aboutMe();// Method is initialize here.
		System.out.println("\n--------------");
		AboutMe alex = new AboutMe();// constructor is initialized here.

		alex.nickName = "Alexander";
		alex.age = 120;
		alex.myHouseRent = 1900;
		alex.myYearlySalary = -4224324;
		alex.myCarPayment = 7422l;
		alex.myAccountBalance = -20384f;
		alex.myPersonalExpenses = 605858;
		alex.sex = 'M';
		alex.usCitizen = true;

		alex.aboutMe(); // Method is initialized here.

	}

}
//