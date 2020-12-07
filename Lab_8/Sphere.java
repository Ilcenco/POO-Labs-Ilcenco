package Lab_8;

public class Sphere extends  GeometricBody{
    public float r;

    public Sphere(float r){
        this.r = r;
    }

    @Override
    public float GetSurface() {
        s = (float) (r * r * 4 * Math.PI);
        return s;
    }

    @Override
    public float GetVolume() {
        v = (float) ((4 * Math.PI * r * r * r)/3);
        return v;
    }

    @Override
    public String toString() {
        return "Sphere";
    }
}
