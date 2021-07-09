package fixtures;

public abstract class Fixture {

	String name;
	String shortDesc;
	String longDesc;
	
	public Fixture(String name, String shortDesc, String longDesc) {
		this.name = name;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
	}
}
