package Lab_8;

public class Paralelipiped extends GeometricBody{
    float a, b, c;

    public Paralelipiped(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public float GetSurface() {
        s = 2*(a*b + a*c + b*c);
        return s;
    }

    @Override
    public float GetVolume() {
        v = a*b*c;
        return v;
    }

    @Override
    public String toString() {
        return "Paralelipiped";
    }
}
