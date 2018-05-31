class Machine {
	public void start() {
		System.out.println("Machine Started");
	}
}

interface Plant {
	public void grow();
}

public class App {
	public static void main(String[] args) {
	    Machine machine1 = new Machine() {
	    	//if you want to override start method in machine, normally you create a new class and say it extends machine
			@Override public void start() {
				System.out.println("Camera Started");
			}
		};
		//the variable is type Machine, what is the actual object? it's been overridden and given a new method
		//one shot anonymous class. can't be duplicated
	    machine1.start();

	    //can't instantiate an interface
	    Plant plant1 = new Plant() {
			@Override
			public void grow() {
				System.out.println("Plant Growing");
			}
		};
	    plant1.grow();
	}
}
