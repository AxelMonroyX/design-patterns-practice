package builder;

/**
 * Created by axel on 9/01/17.
 * github.com/AxelMonroyX
 */
public class MealBuilder {
    public Meal prepareVegMeal() {

        Meal vegMeal = new Meal();
        vegMeal.addItem(new VegBurger());
        vegMeal.addItem(new Coke());
        return vegMeal;
    }

    public Meal prepareNonVegMeal() {
        return null;
    }
}
