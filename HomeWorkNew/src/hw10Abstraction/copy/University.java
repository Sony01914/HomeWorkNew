package hw10Abstraction.copy;

public interface University {

	/*
	 * Interface cant't have constructor
	 * 
	 * public University() { }
	 */
	public void classSize();

	public abstract void playGround();

	public abstract void teacher();

	public default void gymasium() {

	}

	public static void library() {

	}

}
/*
 *  Extends keyword is used for the inheritance in Interface.
 *  Interface can inherit other interface by extends key word.
 *  Interface can't inherit a  regular class by the extends key word.
 *  Interface can't inherit a abstract class by the extends key word.
 *  Interface can inherit multiple Interfaces by extends key word.
 *   
 */
  
