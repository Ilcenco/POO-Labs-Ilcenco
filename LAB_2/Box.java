package com.company.LAB_2;

public class Box {
    public int height = 1;
    public int width = 1;
    public int depht = 1;

    public Box() {
        //default constructor
    }

    public Box(int height, int width, int depht) {
        this.depht = depht;
        this.height = height;   //3 different parameters constructor
        this.width = width;
    }

    public Box(int common_parameter) {
        height = common_parameter;
        width = common_parameter;  //1 parameter constructor
        depht = common_parameter;
    }

    public int area() {
        int res_area = 2 * (height * width + height * depht + width * depht);
        return res_area;
    }

    public int volume() {
        int res_volume = width * height * depht;
        return res_volume;
    }

}
