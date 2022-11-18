package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalinfo();

		System.out.println("\n----------------------------------\n");
		Mammal mammal = new Mammal();
		mammal.mammalinfo();
		mammal.animalinfo(); // Hierarchical Inheritance

		System.out.println("\n-----------------------------------\n");
		Raptile raptile = new Raptile();
		raptile.reptileInfo();
		raptile.animalinfo(); // Hierarchical Inheritance

		System.out.println("\n------------------------------------\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalinfo(); // Hierarchical Inheritance

		System.out.println("\n--------------------------------------\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalinfo(); // Single Inheritance
		dog.animalinfo(); // Multi Inheritance

		System.out.println("\n-------------------------------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo(); // Single Inheritance
		snake.animalinfo(); // Multi Inheritance

		System.out.println("\n-----------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo(); // Single Inheritance
		robin.animalinfo(); // Multi Inheritance

		System.out.println("\n----------\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo(); // Single Inheritance
		bullDog.mammalinfo(); // Multi Inheritance
		bullDog.animalinfo();

		System.out.println("\n-------------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo(); // Single Inheritance
		cobra.reptileInfo(); // Multi Inheritance
		cobra.animalinfo(); // Multi Inheritance

	}

}
