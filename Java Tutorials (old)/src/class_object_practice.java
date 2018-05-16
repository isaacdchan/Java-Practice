class Champion{

	// Instance variables (data or "state")
	String name;
	String role;
	double health;

	// Classes can contain
	// 1. Data 2. Subroutines
	void intro() {
		for(int i=0; i<3; i++) {
			System.out.println("My name is " + name + " and I am a " + role);
		}
	}

	// subroutine/method that prints out champ health
	void say_hello() {
		System.out.println("I have " + health + " health");
	}

	// method that takes in champ's role as parameter and checks if it's a tank
	boolean tank_check(String role) {
		if (role == "Tank") {
			return true;
		}
		else {
			return false;
		}
	}

	// calculation method
	double calculate_urf_hp() {
		double urf_hp = health * 1000;
		return urf_hp;
	}

	// getter method that extracts role variable
	String get_role() {
		return role;
	}

	// if you set 
	public void set_role(String new_role) {
		role = new_role;
	}

	public void set_name(Sting name) {
		this.name = name;
	}
}

// default: available only to package (within the folder)
// public: available to world
// protected: available to package and subclasses
// private: available to class only. used on variables, but variables can be called by methods
// that are public. everyone has access to everything within a class. don't want people messing
// with their variables

public class class_object_practice{
	public static void main(String[] args) {

		Champion champ1 = new Champion();
		champ1.name = "Alistair";
		champ1.role = "Tank";
		champ1.health = 613.4;

		Champion champ2 = new Champion();
		champ2.name = "Teemo";
		champ2.role = "Mage";
		champ2.health = 528;


		double hp = champ1.calculate_urf_hp();
		System.out.println(hp);

		System.out.println(champ2.tank_check(champ2.role));
		

		System.out.println(champ2.name);
		champ2.say_hello();

	}
}