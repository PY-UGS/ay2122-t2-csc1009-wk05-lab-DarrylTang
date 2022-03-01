public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle c = new Circle(5);
        Ellipse e = new Ellipse(7, 7);
        Square s = new Square(6, 6);

        Shape figref; // reference variable
        figref = r;
        System.out.println("Area of rectangle is " + figref.area());
        figref = t;
        System.out.println("Area of triangle is " + figref.area());
        figref = c;
        System.out.println("Area of circle is " + figref.area());
        figref = e;
        System.out.println("Area of ellipse is " + figref.area());
        figref = s;
        System.out.println("Area of square is " + figref.area());
    }
}
