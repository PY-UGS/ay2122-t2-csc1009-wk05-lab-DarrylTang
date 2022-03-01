import static java.lang.Math.*;

public class Circle extends GeometricObject{
    double radius = 1.0;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public void printCircle(){
        System.out.println("Circle with radius "+ this.radius + " and diameter of " + this.getDiameter()
        + " has a perimeter of " + this.getPerimeter()+ " and an area of "+ this.getArea());
    }
}
