package factory;


class ShapeFactory {

    private static final int CIRCLE = 1;
    private static final int RECTANGLE = 2;
    private static final int SQUARE = 3;

    Shape getShape(int shapeType) {
        if (shapeType == CIRCLE) {
            return new Circle();

        } else if (shapeType == RECTANGLE) {
            return new Rectangle();

        } else if (shapeType == SQUARE) {
            return new Square();
        }

        return null;
    }
}