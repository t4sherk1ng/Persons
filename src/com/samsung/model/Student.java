package com.samsung.model;

public class Student extends Person{

    private String group;
    private int score;

    public Student(String firstName, String secondName, int age, String group, int score) {
        super(firstName, secondName, age);
        this.group = group;
        this.score = score;
    }

    public Student(String firstName, String secondName, int age, int phone, String group, int score) {
        super(firstName, secondName, age, phone);
        this.group = group;
        this.score = score;
    }

    public String getGroup() {
        return group;
    }

    public int getScore() {
        return score;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
