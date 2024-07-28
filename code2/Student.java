package com.assignment12.code2;

public class Student {
    //2. Design a Student Parent class and ZSGSStudent Child class.
    // Create constructors in both class with varying number of parameters.
    // Call parent constructor from child constructor. Try experimenting by creating child object using parent constructor.
    String name;
    int id;
    int age;
    Student(){
        this("",-1,-1);
    }
    Student (String name){
        this.name=name;
    }
    Student(String name,int id){
        this(name);
        this.id=id;
    }
    Student(String name,int id,int age){
        this(name, id);
        this.age=age;
    }
}
