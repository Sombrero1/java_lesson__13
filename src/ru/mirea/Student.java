package ru.mirea;

import java.util.Comparator;
import java.util.Objects;

public class Student {
    private static int value=0;
    private int iDNumber;
    private double GPA;


    Student(double gpa){
        value++;
        this.iDNumber=value;
        this.GPA=gpa;

    }

    public double getGPA() {
        return GPA;
    }

    public int getiDNumber() {
        return iDNumber;
    }



}
