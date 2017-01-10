package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by axel on 9/01/17.
 * github.com/AxelMonroyX
 */
public class Meal {
    private List<Item> _items = new ArrayList<Item>();


    public void addItem(Item item) {
        _items.add(item);
    }

    public double getCost() {
        float cost = 0.0f;
        for (Item item : _items) {
            cost += item.price();
        }
        return cost;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Veg Meal\n");
        for (Item item : _items) {
            sb.append("Item : ")
                    .append(item.name())
                    .append(", Packing : ")
                    .append(item.packing().get_packingname())
                    .append(", Price : ")
                    .append(item.price())
                    .append("\n");
        }
        sb.append("Total Cost: ").append(getCost());


        return sb.toString();
    }
}
