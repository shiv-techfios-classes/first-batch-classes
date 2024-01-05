package builder;

public class MealBuilder {
	
	public Meal prepareVegMeal() {
		
		Meal veg = new Meal();
		
		veg.addItems(new VegBurger());
		veg.addItems(new Coke());
	
		return veg;
	}
	
	public Meal prepareNonVegMeal() {
		
		Meal nonVeg = new Meal();
		
		nonVeg.addItems(new ChickenBurger());
		nonVeg.addItems(new Pepsi());
		
		return nonVeg;
	}

}
