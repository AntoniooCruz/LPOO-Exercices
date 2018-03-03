package recipes;

public abstract class Ingredient implements Comparable<Ingredient>{
	private String name;
	
	public Ingredient(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return this.getName();
	}
	public int compareTo(Ingredient ing) {
		return this.name.compareTo(ing.name);
	}


}
