public class Rectangle extends Shape{

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {
        System.out.println("Inside area for rectangle");
        return dim1 * dim2;
    }
}
