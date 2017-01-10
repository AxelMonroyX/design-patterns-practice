package factory;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class test_factory {

    private static final int CIRCLE = 1;
    private static final int RECTANGLE = 2;
    private static final int SQUARE = 3;

    @Test
    public void test_factory() {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape_circle = shapeFactory.getShape(CIRCLE);
        Shape shape_rectangle = shapeFactory.getShape(RECTANGLE);
        Shape shape_square = shapeFactory.getShape(SQUARE);
        assertEquals("Im a circle", shape_circle.draw());
        assertEquals("Im a rectangle", shape_rectangle.draw());
        assertEquals("Im a square", shape_square.draw());


    }


}