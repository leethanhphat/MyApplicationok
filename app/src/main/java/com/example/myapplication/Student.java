package com.example.myapplication;

import androidx.annotation.NonNull;

import javax.xml.namespace.QName;

public class Student extends  Human {
    public Student(String name, float GPA) {
        super(name);
        this.GPA = GPA;
    }

    private float GPA;

    @NonNull
    @Override
    public String toString() {
        return "Human("+ name + ", "+ GPA +")";
    }
}
