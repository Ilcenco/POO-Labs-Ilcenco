package Lab_8;

import java.util.ArrayList;

public class Lab_8_Main {
    public static void main(String[] args) {

        Cub cub = new Cub(5);
        Sphere sphere = new Sphere(5);
        Paralelipiped paralelipiped = new Paralelipiped(4, 5, 6);

        ArrayList<GeometricBody> list = new ArrayList<>();
        list.add(cub);
        list.add(sphere);
        list.add(paralelipiped);

        for (GeometricBody body : list){
            System.out.println(body + ": ");
            System.out.println("Aria: " + body.GetSurface());
            System.out.println("Volume: " + body.GetVolume());
            System.out.println();
        }

        GeometricBodyController gbc = new GeometricBodyController();
        System.out.println("Biggest aria has the " + gbc.BiggestArea(list));
        System.out.println("Biggest volume has the " + gbc.BiggestVolume(list));




    }
}
