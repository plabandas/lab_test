public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory1 = ShapeFactory.getInstance();
        ShapeFactory shapeFactory2 = ShapeFactory.getInstance();

        System.out.println("Square"+shapeFactory1.hashCode());
        System.out.println("Rectangle"+shapeFactory2.hashCode());

        Shape shape1 = shapeFactory1.getShape("SQUARE");shape1.draw();
        Shape shape2 = shapeFactory2.getShape("RECTANGLE");shape2.draw();
    }
}