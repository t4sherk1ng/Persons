package com.samsung.service;

import com.samsung.model.Person;
import com.samsung.model.Student;

public class StudentPrinter extends PersonPrinter{
    @Override
    public void printInfo(Person p) {
        super.printInfo(p);
        Student s = (Student) p;
        System.out.println("" + "Группа: " + s.getGroup() + '\n' + "Баллы: " + s.getScore());
    }
}
