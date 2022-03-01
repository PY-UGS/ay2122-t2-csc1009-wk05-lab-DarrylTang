public abstract class Shape {
    double dim1;
    double dim2;
    double PI = 3.14;

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public Shape(double dim1) {
        this.dim1 = dim1;
    }

    public abstract double area();


}
