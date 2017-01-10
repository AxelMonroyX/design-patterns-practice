import builder.test_builder;
import factory.test_factory;
import observer.test_observer;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import singleton.test_singleton;


/**
 * Created by axel on 9/01/17.
 * github.com/AxelMonroyX
 */

@RunWith(Suite.class)
@SuiteClasses({test_builder.class,
        test_factory.class,
        test_observer.class,
        test_singleton.class})
public class AppTest {
}

