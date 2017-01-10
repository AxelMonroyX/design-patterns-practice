package singleton;

/**
 * Created by axel on 9/01/17.
 * github.com/AxelMonroyX
 */
class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    static SingleObject getInstance() {
        return instance;
    }

    String showMessage() {
        return "I'm a singleton";
    }
}
