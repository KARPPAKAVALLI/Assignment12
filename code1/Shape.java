package com.assignment12.code1;

public class Shape {
    //1. Write a hierarchy of geometric shape classes 'Circle', 'Rectangle', etc inherited from a common base class 'Shape'
    String colour;
    Shape(){
        this("Pink");
    }
    Shape(String colour){
        this.colour=colour;
    }
    public float calculateArea(){
        return 0;
    }
    public float calculatePerimeter(){
        return 0;
    }

}
