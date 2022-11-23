package hw10Abstraction.copy;



public interface College {
	public abstract void commonRoom();

	public void labrotatory();

	public void languageClub();
	
	public default void dorm  () {
		
	}
	public static void studyRoom() {
		
	}

}
