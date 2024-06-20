package com.basics_java;

public class Student {
    private String name;
    private String last_name;
    private int age;
    
    // Constructor por defecto
    public Student(){
        
    }

    public Student(String name, String last_name, int age){
        this.name = name;
        this.last_name = last_name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}