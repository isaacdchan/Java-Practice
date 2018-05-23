public class App {
	public static void main(String[] args) {
		//polymorphism: if you have a child class of some parent class, you can always use the child class anywhere you would normally use the parent class
		//what about privacy modifiers?

		Plant plant1 = new Plant();
		Tree tree1 = new Tree();

		//only one actual plant object (plant1) but the plant2 variable of type Plant is pointing to the same thing
		Plant plant2 = plant1;

		Plant plant3 = tree1;
		//tree is a child of plant so plant3 is also a plant
		//plant 3 is pointing at a tree object and will use the tree.grow() instead of plant.grow(), despite its name and variable type (both are plant)
		plant3.grow();

		//this works because a tree is calling a tree method
		tree1.shed_leaves();
		//this does not work because the reference is what matters when calling method
		//plant3.shed_leaves();
		//this works because you've added the disclaimer that specifies the method is from tree
		//you could call plant3.grow() and it'd call the tree.grow() instead of plant because plant has the ability to call .grow() but it uses the tree method
		//if you included a shed_leaves() to plant, it'd me able to call tree's shed_leaves()
		//it's the variable that decides which methods you can call. when you call you go to the object
		((Tree) plant3).shed_leaves();

		//works because tree is a child of plant
		doGrow(tree1);
	}

	//takes in a type plant variable, labels it as plant, and grows it
	public static void doGrow(Plant plant) {
		plant.grow();
	}
}
