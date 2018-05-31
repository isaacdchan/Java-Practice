class Machine {
	public void start() {
		System.out.println("Machine Started");
	}
}

class Camera extends Machine {
	@Override
	public void start() {
		System.out.println("Camera Started");
	}
	public void snap() {
		System.out.println("Photo Taken");
	}
}

public class App {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();

		camera1.snap();
		//UPCASTING
		//can use child type where you would expect a parent type
		//the variable name is type Machine, but the actual type is Camera
		Machine machine2 = new Camera();
		//the start method used is Camera.start() because the variable name determines which methods you CAN call, but the object type determines which ones you WILL call
		machine2.start();

		//DOWNCASTING
		//frustrating that machine2.snap() will not work even though the object is a camera. hindered by the variable name
		Machine machine3 = new Camera();
		//need the variable type that you're casting to in parentheses before the variable you're referring to
		//conforming you want to convert machine3 (type Machine) to something that's type Camera
		Camera camera2 = (Camera) machine3;
		//so the machine3 variable was not able to call snap() so create new variable Camera3 that IS type camera but is referring to the machine 3 variable (which is really a camera object)

		//can now call snap(). when calling start() will still call camera.start() because it was a camera object all along
		camera2.snap();
		camera2.start();

		//this will throw an exception because mahine1 was both variable type and object type Machine
		//only if the variable was Machine and the object was Camera should you down cast. purpose was to use methods restricted by variable type. so even if you gain access to new methods thanks to change in variable type, the actual object lacks thos methods.
		Camera camera3 = (Camera) machine1;
	}
}
