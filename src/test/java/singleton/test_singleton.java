package singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by axel on 9/01/17.
 * github.com/AxelMonroyX
 */
public class test_singleton {
    @Test
    public void test_Singleton() {
//        Can't create new one, just get the instance
//        SingleObject object = new SingleObject();
        SingleObject object = SingleObject.getInstance();
        SingleObject object1 = SingleObject.getInstance();

        assertEquals("I'm a singleton", object.showMessage());
        assertEquals(object, object1);
        assertEquals(object.toString(), object1.toString());


    }
}
