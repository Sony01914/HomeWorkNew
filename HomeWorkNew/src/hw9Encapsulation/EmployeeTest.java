package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Sony");
		employee.setAge(30);
		employee.setSex('M');
		employee.setUsCitizen(true);

		System.out.println("Employee name:" + employee.getName() + "\nEmployee age: " + employee.getAge()
				+ "\nEmployee sex:" + employee.getSex() + "\nEmployee US citizen? " + employee.isUsCitizen());

	}

}
