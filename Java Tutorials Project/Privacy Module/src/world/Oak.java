package world;

public class Oak extends Plant{

	public Oak() {
		// even though world.Oak extends plant, can't access type because type variable is private
		// type = "tree";

		// this works because size is protected and subclasses can access protected
		this.size = "Big";
		//height has no modifier and Oak in same package
		this.height = 12;
	}
}
