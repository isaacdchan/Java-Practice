package world;

public class Field {
	//every time you access the field class, it creates a plant object as well
	//can do it like below, or with constructors. the constructor below automatically prints the size, which hasn't been assigned yet
	private Plant field_plant = new Plant();

	public Field() {
		System.out.println(field_plant.size);
	}
}
