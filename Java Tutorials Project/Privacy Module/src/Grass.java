import world.Plant;

public class Grass extends Plant {
	//constructor
	public Grass() {
		//Grass may be a subclass/child of plant, but it's not in the same package
		System.out.println("this.height");
	}

}
