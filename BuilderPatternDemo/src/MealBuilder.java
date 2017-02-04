public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal mealList = new Meal();
		mealList.addItem(new VegBurger());
		mealList.addItem(new Coke());
		return mealList;
	}

	public Meal prepareNonVegMeal() {
		Meal mealList = new Meal();
		mealList.addItem(new ChickenBurger());
		mealList.addItem(new Pepsi());
		return mealList;
	}
}
