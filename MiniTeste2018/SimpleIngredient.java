package recipes;

public class SimpleIngredient extends Ingredient {
	
	public SimpleIngredient(String name){
		super(name);
		if(name == null) {
			throw new IllegalArgumentException();
		}
	}
	

	public boolean equals(Object ing) {
		return this.getName() == ((SimpleIngredient) ing).getName();
	}
	

}
