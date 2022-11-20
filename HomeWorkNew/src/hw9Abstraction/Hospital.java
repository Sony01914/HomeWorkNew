package hw9Abstraction;

public interface Hospital {
	
	public void emergancyRoom();
	
	public abstract void surgeryRoom();
	
	public void careteria();
	
	public default void morgue() {
		
	}
	
	public static void pharmacy () {
		
	}

}
