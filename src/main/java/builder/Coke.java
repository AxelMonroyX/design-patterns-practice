package builder;

/**
 * Created by axel on 9/01/17.
 * github.com/AxelMonroyX
 */
public class Coke implements Item {
    public String name() {
        return "Coke";
    }

    public Packing packing() {
        return new Packing("Bottle");
    }

    public float price() {
        return 30.0f;
    }
}
