package com.example.studentmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private float marks1;
    private float marks2;
    private float marks3;
    private float marks4;
    private float marks5;
    private float percentage;
    private String division;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMarks1() {
        return marks1;
    }

    public void setMarks1(float marks1) {
        this.marks1 = marks1;
    }

    public float getMarks2() {
        return marks2;
    }

    public void setMarks2(float marks2) {
        this.marks2 = marks2;
    }

    public float getMarks3() {
        return marks3;
    }

    public void setMarks3(float marks3) {
        this.marks3 = marks3;
    }

    public float getMarks4() {
        return marks4;
    }

    public void setMarks4(float marks4) {
        this.marks4 = marks4;
    }

    public float getMarks5() {
        return marks5;
    }

    public void setMarks5(float marks5) {
        this.marks5 = marks5;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}
