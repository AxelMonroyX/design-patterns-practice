package builder;

/**
 * Created by axel on 9/01/17.
 * github.com/AxelMonroyX
 */
abstract class Burger implements Item {
    public String name() {
        return "simple burger";
    }

    public Packing packing() {
        return null;
    }

    public float price() {
        return 0;
    }
}
