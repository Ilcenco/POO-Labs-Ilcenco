package com.company;


public class Main {

    public static void main(String[] args) {
        Monitor mon1 = new Monitor();
        mon1.color = "Gray";
        mon1.d1 = 32; // cm
        mon1.d2 = 18; // cm
        mon1.r1 = 1024;// p
        mon1.r2 = 768; // p

        Monitor mon2 = new Monitor();
        mon2.color = "Black";
        mon2.d1 = 42; // cm
        mon2.d2 = 26; // cm
        mon2.r1 = 1920;// p
        mon2.r2 = 1080;// p

        CompMon tt = new CompMon();
        tt.comp(mon1.color, mon2.color, mon1.d1, mon1.d2, mon2.d1, mon2.d2, mon1.r1, mon1.r2, mon2.r1, mon2.r2);
        
    }
}
 