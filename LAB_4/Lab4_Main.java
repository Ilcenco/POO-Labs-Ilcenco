package com.company.LAB_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab4_Main {

    public static void main(String[] args) {
        String expressions[] = new String[10];
        int numEx = 0;

        try {
            File textFile = new File("C://Users//eilce//Desktop//Programare//src//com//company//LAB_4//three_expressions.txt");
            Scanner ReadFile = new Scanner(textFile);
            while (ReadFile.hasNextLine()) {
                expressions[numEx] = ReadFile.nextLine();
                numEx++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }


        for(int i =0; i<numEx; i++){
            expressions[i] = expressions[i].replace(" ", "");
            expressions[i] = expressions[i].substring(2, expressions[i].length());
        }

        int k = 0;
        for(String i : expressions) {
            Expression_ver VER = new Expression_ver(i);
            VER.Remove_num_signs();
            VER.check_P_valid();
            System.out.println("For expression nr " + (k+1) + " parenthesses validation is " + VER.valid);
            k++;
        }
    }
}
