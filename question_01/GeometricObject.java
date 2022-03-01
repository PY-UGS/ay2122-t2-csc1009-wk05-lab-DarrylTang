import java.util.Date;

public class GeometricObject {
    String color = "white";
    boolean filled = false;

    java.util.Date dateCreated = new java.util.Date();

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public GeometricObject() {
    }

    public String returnString(){
        return "created on " + this.dateCreated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}
