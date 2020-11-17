package Lab_7;

public class Rectangle extends Figure {
    public float lat1;
    public float lat2;

    public float a, p;

    public Rectangle(float lat1, float lat2) {
        this.lat1 = lat1;
        this.lat2 = lat2;
    }

    @Override
    public float getArea() {
        a = lat1 * lat2;
        return a;
    }

    @Override
    public float getPerimeter() {
        p = lat1 * 2 + lat2 * 2;
        return p;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
