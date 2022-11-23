package hw10Abstraction.copy;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	
	public ColumbiaUniversity() {
		
	}	
	// abstract method can not be created in the class
	/*
	 * public abstract void chemistry();
	 */
		
		 public  void biology() {
			 System.out.println("This is non abstract method from ColumbiaUniversity class ");
			 
		 }
	@Override
	public void lawinfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void vocationalSchool() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hygine() {
		// TODO Auto-generated method stub
		
	}
		
	}

// Extends and implements keyword used for the inheritance a regular class.
// Regular class can inherit other regular class by the extends keyword.
// Regular class can't inherit a Interface by extends key word.
// Regular class can inherit multiple interface by implements key word.
//Regular class can inherit one abstract class or one regular class.
