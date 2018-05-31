//class that can work with classes different from itself. must specify with instantiating class
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

class Fruit {

}

public class App {
	public static void main(String[] args) {
		//ArrayLists are internally managed array so the size does not have to be predetermined
		//parametrized class. must specify what class will be added
		ArrayList<String> list1 = new ArrayList<String>();

		list1.add("Apple");
		list1.add("Orange");
		list1.add("Pear");
		list1.add("Banana");

		//create new variable of type String and name fruit by .get(index)
		String fruit = list1.get(3);

		//some classes take two parameters so separate with comma
		//only have to enter one diamond bracket
		HashMap<Integer, Double> hashmap1 = new HashMap<>();

		ArrayList<Fruit> list2 = new ArrayList<>();
	}
}
