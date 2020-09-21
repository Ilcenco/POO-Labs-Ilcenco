package com.company;

import com.company.LAB_1.CompMon;
import com.company.LAB_1.Monitor;
import com.company.LAB_1.Student;
import com.company.LAB_1.Univeristy;

public class LAB_1_MAIN {
    public static double Average(Univeristy u ){
        double med = 0;
        for(Student e : u.list){
            med = med + e.mark;
        }
        med = med / u.list.size();
        return med;
    }

    public static void main(String[] args) {
        ////////////////////////////////////////////NOTA 5-6///////////////////////////////////////////////////////////
        System.out.println();
        System.out.println("Nota 5-6:");
        Monitor mon1 = new Monitor("Black", 34, 18, 3000, 2000);
        Monitor mon2 = new Monitor("Green", 46, 22, 720, 320);
        CompMon tt = new CompMon();
        tt.comp(mon1.color, mon2.color, mon1.d1, mon1.d2, mon2.d1, mon2.d2, mon1.r1, mon1.r2, mon2.r1, mon2.r2);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println();
        System.out.println("Nota 7-8:");

        ////////////////////////////////////////////Nota 7-8////////////////////////////////////////////////////////////
        Univeristy u1 = new Univeristy("UTM", 1856);
        Student s1 = new Student("Andrei", 14, 6.5);
        Student s2 = new Student("Mike", 15, 9.3);
        Student s3 = new Student("Tomy", 16, 6.7);
        u1.list.add(s1);
        u1.list.add(s2);
        u1.list.add(s3);

        for (Student el : u1.list) {
            System.out.println(el.name);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println();
        System.out.println("Nota 9-10");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Univeristy u2 = new Univeristy("USM", 1656);
        Student s4 = new Student("Andy", 14, 8.5);
        Student s5 = new Student("Mimmi", 15, 9.6);
        Student s6 = new Student("Tor", 14, 6.1);
        u2.list.add(s4);
        u2.list.add(s5);
        u2.list.add(s6);

        Univeristy u3 = new Univeristy("ASEM", 1899);
        Student s7 = new Student("Anny", 14, 5.5);
        Student s8 = new Student("Mary", 15, 7.3);
        Student s9 = new Student("Tyson", 14, 6.0);
        u3.list.add(s7);
        u3.list.add(s8);
        u3.list.add(s9);

        System.out.println("1'st University average mark is: "+Average(u1));
        System.out.println("2'nd University average mark is: "+Average(u2));
        System.out.println("3'rd University average mark is: "+Average(u3));



    }
}