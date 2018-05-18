import world.Plant;

public class Main2 {
	public static void main(String[] args) {
	    Plant plant = new Plant();

	    System.out.println(plant.name);
	    // won't work plant is private
	    // System.out.println(plant.type);

		// protected means only within package. since plant is in the world package, Main2 can't see it
		// System.out.println(plant.size);
		//same with height. it only has package level
		// System.out.println(plant.height);
	}
}
