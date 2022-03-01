public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle("white", false, 1);
        System.out.println("A circle " + circle.returnString());
        System.out.println("Color: " + circle.getColor() + " and Filled: " +circle.isFilled());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        circle.printCircle();

        System.out.println("");
        Rectangle rectangle = new Rectangle("white", false, 2, 4);
        System.out.println("A rectangle " + rectangle.returnString());
        System.out.println("Color: " + rectangle.getColor() + " and Filled: " +rectangle.isFilled());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());

    }
}
