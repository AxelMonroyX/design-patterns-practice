package builder;

/**
 * Created by axel on 9/01/17.
 * github.com/AxelMonroyX
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 15.0f;
    }

    @Override
    public Packing packing() {
        return new Packing("Wrapper");
    }
}
