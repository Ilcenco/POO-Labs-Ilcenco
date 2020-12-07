package Lab_8;

public class Cub extends  GeometricBody{
    public float lat;

    public Cub(float lat){
        this.lat = lat;
    }

    @Override
    public float GetSurface() {
        s =  lat*lat*6;
        return s;
    }

    @Override
    public float GetVolume() {
        v = lat*lat*lat;
        return v;
    }

    @Override
    public String toString() {
        return "Cub";
    }
}
