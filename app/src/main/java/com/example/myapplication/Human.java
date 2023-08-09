package com.example.myapplication;

public class Human {
    public Human(String name) {
        this.name = name;
    }

    protected String name;
   public String toString(){
       return "Human("+ name + ")";
   }
}
