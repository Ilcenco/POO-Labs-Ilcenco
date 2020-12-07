package Lab_8;

import java.util.ArrayList;

public class GeometricBodyController {

    public GeometricBody BiggestArea(ArrayList<GeometricBody> list){
        GeometricBody MaximalArea = null;
        float maxA = -1;

        for (GeometricBody body : list){
            if(body.GetSurface() > maxA){
                maxA = body.GetSurface();
                MaximalArea = body;
            }
        }

        return MaximalArea;
    }

    public GeometricBody BiggestVolume(ArrayList<GeometricBody> list){
        GeometricBody MaximalVolume = null;
        float maxV = -1;

        for (GeometricBody body : list){
            if(body.GetVolume() > maxV){
                maxV = body.GetVolume();
                MaximalVolume = body;
            }
        }
        return MaximalVolume;
    }
}
