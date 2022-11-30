package hw11Abstraction;

public  class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	
	public ColumbiaUniversity() {
		
	}	
	// abstract method can not be created in the class
	/*
	 * public abstract void chemistry();
	 */
		
		 public  void biology() {
			 System.out.println("This is non abstract method from ColumbiaUniversity class ");
			 
		 }
		 
		 public static void sony () {
			 System.out.println("This ststic method from comumbiaUniversity class");
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
	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void labrotatory() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void emergancyRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void careteria() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void aeronauticalInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mechanicalLab() {
		// TODO Auto-generated method stub
		
	}
		
	}

// Extends and implements keyword used for the inheritance a regular class.
// Regular class can inherit other regular class by the extends keyword.
// Regular class can't inherit a Interface by extends key word.
// Regular class can inherit multiple interface by implements key word.
//Regular class can inherit one abstract class or one regular class.
