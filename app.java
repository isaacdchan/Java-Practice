class Champion {

	String name;
	String role;
	double health;

	void intro() {
		System.out.println("My name is " + name + " my role is " + role);
	}

	boolean tank_check(String role) {
		if (role == "Tank") {
			return true;
		}
		else {
			return false;
		}
	}

	void set_role(String new_role) {
		role = new_role;
	}

	void set_name(String name) {
		this.name = name;
	}

	String get_role() {
		return role;
	}

	double urf_hp() {
		double urf_hp = health * 1000;
		return urf_hp;
	}

	public void set_all(String name, String role) {
		set_role(role);
		set_name(name);
	}	
}

public class app {
	public static void main(String[] args) {
		
		Champion champ1 = new Champion();
		champ1.name = "Johnathon";
		champ1.role = "ADC";
		champ1.health = 69.420;

		System.out.println(champ1.tank_check(champ1.role));
	}
}