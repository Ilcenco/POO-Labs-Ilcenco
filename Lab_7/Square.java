package Lab_7;

public class Square extends Figure {
    public float lat1;

    public Square(float lat1) {
        this.lat1 = lat1;
    }

    @Override
    public float getArea() {
        a = lat1 * lat1;
        return a;
    }

    @Override
    public float getPerimeter() {
        p = lat1 * 4;
        return p;
    }

    @Override
    public String toString() {
        return "Square";
    }
}
