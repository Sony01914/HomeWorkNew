package hw11Abstraction;

public class TestInstitute {
	public static void main(String[] args) {
		System.out.println("\n------ComumbiaUniversity");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.biology();
		ColumbiaUniversity.sony(); // Here is static method of ColumbiaUniversity class called by the class
		columbiaUniversity.lawinfo();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.caring();
		columbiaUniversity.commonRoom();
		columbiaUniversity.labrotatory();
		columbiaUniversity.languageClub();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.emergancyRoom();
		columbiaUniversity.vocationalSchool();
		columbiaUniversity.careteria();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.gymasium();
		columbiaUniversity.vocationalSchool();

		System.out.println("\n-------------University------------\n");
		University university = new ColumbiaUniversity();
		university.classSize();
		university.playGround();
		university.gymasium();
		university.teacher();
		university.commonRoom();
		university.labrotatory();
		university.languageClub();
		university.dorm();
		university.emergancyRoom();
		university.surgeryRoom();
		university.careteria();
		university.morgue();
		University.library(); // Here static method of University Interface called by the abstract class
								// itself.

		System.out.println("\n------------ Medicalschool----\n");
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.hygine();
		medicalSchool.caring();
		medicalSchool.lawinfo();
		medicalSchool.aeronauticalInfo();
		medicalSchool.anthropology();
		medicalSchool.maths();
		medicalSchool.mechanicalLab();
		medicalSchool.computerLab();
		MedicalSchool.java(); // Here is static method of MedicalSchool called by the abstract class.

	}

}
