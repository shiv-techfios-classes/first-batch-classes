package builder;

public class MealBuilderPattern {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		
		System.out.println("Displaying Veg Meal.......");
		
		vegMeal.showItems();
		
		System.out.println("Total Cost:" + 	vegMeal.getCost() );
		
		Meal nonVegMeal =  mealBuilder.prepareNonVegMeal();
		
		System.out.println("Displaying Non-Veg Meal.......");
		
		nonVegMeal.showItems();
		
		System.out.println("Total Cost:" + 	nonVegMeal.getCost() );
	

	}

}
