package com.example.springboot.controller;

import java.util.Comparator;

public class StudentComparator  implements Comparator {

    //按学生成绩升序

    public int compare(Object o1, Object o2) {
        Student s1 =(Student)o1;
        Student s2 =(Student)o2;
        return s1.score - s2.score;
    }




}
