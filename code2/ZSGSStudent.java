package com.assignment12.code2;

public class ZSGSStudent extends Student{
    //2. Design a Student Parent class and ZSGSStudent Child class.
    // Create constructors in both class with varying number of parameters.
    // Call parent constructor from child constructor. Try experimenting by creating child object using parent constructor.

    int zsgsId;
    ZSGSStudent(){
        super();
        this.zsgsId=-1;
    }
    ZSGSStudent(String name,int id,int zsgsId){
        super(name,id);
        this.zsgsId=zsgsId;
    }
    ZSGSStudent(String name,int id,int age,int zsgsId){
        super(name,id,age);
        this.zsgsId=zsgsId;
    }
}
