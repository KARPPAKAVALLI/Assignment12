package com.assignment12.code2;

public class Main {
    //2. Design a Student Parent class and ZSGSStudent Child class.
    // Create constructors in both class with varying number of parameters.
    // Call parent constructor from child constructor. Try experimenting by creating child object using parent constructor.
    public static void main(String[] args) {
        ZSGSStudent s1=new ZSGSStudent("Jake",100,201);
        ZSGSStudent s2=new ZSGSStudent("Amy",101,202,21);

        //creating child object using parent constructor.
        //the following line gives compiler error.
        //ZSGSStudent s3=new Student();
    }
}
