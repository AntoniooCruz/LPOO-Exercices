package recipes;

import java.util.ArrayList;

public class Recipe  {
	private String name;
	private ArrayList<RecipeStep> steps = new ArrayList<RecipeStep>();
	
	public Recipe(String name) {
		this.name = name;
	}
	public void addStep(RecipeStep step) {
		for(int i=0;i<steps.size();i++){
			if(steps.get(i).getName() == step.getName()) {
				return;
			}
		}
		steps.add(step);
	}
	public int getStepCount() {
		return steps.size();
	}

}
