package com.example.springboot.controller;

public class Student {

    int score;

    public Student(int score) {
        this.score = score;
    }

    public String toString() {
        return String.valueOf(score);
    }
}
