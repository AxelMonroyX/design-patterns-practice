package builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class test_builder {


    @Test
    public void test_factory() {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        assertEquals(45.0f, vegMeal.getCost(), 0.001);


        assertEquals("Veg Meal\n" +
                "Item : Veg Burger, Packing : Wrapper, Price : 15.0\n" +
                "Item : Coke, Packing : Bottle, Price : 30.0\n" +
                "Total Cost: 45.0", vegMeal.print());


    }


}