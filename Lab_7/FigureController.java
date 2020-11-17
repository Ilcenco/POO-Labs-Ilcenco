package Lab_7;

import java.util.ArrayList;

public class FigureController {

    public Figure bigArea(ArrayList<Figure> lista){
        float maxA = -1; // set -1 because avery area is already bigger than -1;
        Figure figBigArea = null;
        for(Figure f :lista){
            if(f.getArea() > maxA){
                figBigArea = f;
                maxA = f.getArea();
            }
        }
        return figBigArea;
    }

    public Figure bigPerimeter(ArrayList<Figure> lista){
        float maxPer = -1;
        Figure figBigPer = null;
        for(Figure f :lista){
            if(f.getPerimeter() > maxPer){
                figBigPer = f;
                maxPer = f.getPerimeter();
            }
        }
        return figBigPer;
    }

}
