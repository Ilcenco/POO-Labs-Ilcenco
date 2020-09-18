package com.company.LAB_1;

import com.company.LAB_1.Student;

import java.util.ArrayList;
import java.util.List;

public class Univeristy {
    public String name;
    public int FoundYear;
    public List<Student> list = new ArrayList<>();

    public Univeristy(String name, int FoundYear){
        this.name = name;
        this.FoundYear = FoundYear;
    }

}
