package Lab_7;

import java.util.ArrayList;

public class Lab_7_Main {
    public static void main(String[] args) {
        Square patrat = new Square(5);
        Rectangle dreptunghi = new Rectangle(14, 50);
        Triangle triunghi = new Triangle(30, 40, 50);

        Figure Circle = new Figure() {
            public float r = 15;

            @Override
            public float getArea() {
                return (float) (Math.PI * r * r);
            }

            @Override
            public float getPerimeter() {
                return (float) (Math.PI * 2 * r);
            }

            @Override
            public String toString() {
                return "Cirlce";
            }
        };
        ArrayList<Figure> lista = new ArrayList<>();
        lista.add(patrat);
        lista.add(dreptunghi);
        lista.add(triunghi);
        lista.add(Circle);

        for (Figure f : lista) {
            System.out.println(f);
            System.out.println("Aria: " + f.getArea());
            System.out.println("Perimeter: " + f.getPerimeter());
            System.out.println();
        }

        FigureController fc = new FigureController();
        System.out.println("Biggest aria has the " + fc.bigArea(lista));
        System.out.println("Biggest perimeter hat the " + fc.bigPerimeter(lista));


    }
}
