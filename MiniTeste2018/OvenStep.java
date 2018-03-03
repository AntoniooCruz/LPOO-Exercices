package recipes;

import java.util.ArrayList;

public class OvenStep extends RecipeStep {
	private int temperature;
	private ArrayList<SimpleIngredient> ingredients = new ArrayList<SimpleIngredient>();
	
	public OvenStep(String name, String action, int temperature) {
		super(name,action);
		this.temperature = temperature;
	}
	
	public void addIngredient(SimpleIngredient ing,int amount) {
		for(int i=0;i<amount;i++) {
			ingredients.add(ing);
		}
		
	}
	public int getTemperature() {
		return temperature;
	}
	

}
