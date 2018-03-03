package recipes;
import java.util.ArrayList;
public class RecipeStep extends Ingredient {
	private String action;
	private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
	private ArrayList<Float> quantity = new ArrayList <Float>();
	private ArrayList<RecipeStep> recipes = new ArrayList<RecipeStep>();
	private ArrayList<Float> quantityRecipes = new ArrayList <Float>();
	
	public RecipeStep(String name, String action){
		super(name);
		this.action = action;
		if(name == null || action == null) {
			throw new IllegalArgumentException();
		}
	}
	
	public String getAction() {
		return action;
	}
	public void addIngredient(Ingredient ing,float quant) {
		for(int i=0;i<ingredients.size();i++) {
			if(ingredients.get(i).equals(ing)) {
				return;
			}
		}
		ingredients.add(ing);
		quantity.add(quant);
		
	}
	public void addIngredient(RecipeStep ing,float quant) {
		for(int i=0;i<recipes.size();i++) {
			if(recipes.get(i).equals(ing)) {
				return;
			}
		}
		recipes.add(ing);
		quantityRecipes.add(quant);
		
	}
	
	
	public int getIngredientCount() {
		return ingredients.size();
	}
	public Float getQuantity(Ingredient ing) {
		Float quant = 0f;
		for(int i=0;i<ingredients.size();i++) {
			if(ingredients.get(i).equals(ing)) {
				quant = quantity.get(i);
			}
		}
		for(int i=0;i<recipes.size();i++) {
			for(int j=0; j<recipes.get(i).getIngredients().size();j++) {
				if(recipes.get(i).getIngredients().get(j).equals(ing)) {
					return quant = quant + ( recipes.get(i).getQuant().get(j) * quantityRecipes.get(i));
				}
			}
		}
		return quant;
	}
	public float getQuantity(RecipeStep ing) {
		for(int i=0;i<recipes.size();i++) {
			if(recipes.get(i).equals(ing)) {
				return quantityRecipes.get(i);
			}
		}
		return 0;
	}
	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}
	public ArrayList<Float> getQuant() {
		return quantity;
	}
	
	public String toString() {
		String str;
		str = "to make " + this.getName() + ", " + this.getAction() + " " ;
		if(recipes.size() != 0) {
			str = str + quantityRecipes.get(0) * 1.0 + " " + recipes.get(0).getName() +", ";
		}
		
		if(ingredients.size() != 0) {
			for(int i=0;i<ingredients.size();i++) {
				if(i!= ingredients.size() -1) {
					str = str + quantity.get(i) + " " + ingredients.get(i) + ", ";
				}
				else {
					str = str + quantity.get(i) + " " + ingredients.get(i);
				}
			}
		}
		
		return str;
		
	}
	

}
