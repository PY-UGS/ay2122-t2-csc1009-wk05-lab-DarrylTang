public class Circle extends Shape{

    public Circle(double dim1) {
        super(dim1);
    }

    public double area() {
        System.out.println("Inside area for circle");
        return PI * dim1 * dim1;
    }
}
