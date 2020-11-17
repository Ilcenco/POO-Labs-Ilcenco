package Lab_7;

public class Triangle extends Figure{
    public float lat1, lat2, lat3;
    public float a,p;

    public Triangle(float lat1, float lat2, float lat3){
        this.lat1 = lat1;
        this.lat2 = lat2;
        this.lat3 = lat3;
    }

    @Override
    public float getArea() {
        float sp = (lat1 + lat2 + lat3)/2;
        a = (float) Math.sqrt(sp * (sp - lat1) * (sp - lat2) * (sp - lat3));
        return a;
    }

    @Override
    public float getPerimeter() {
        p = lat1 + lat2 + lat3;
        return p;
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}
