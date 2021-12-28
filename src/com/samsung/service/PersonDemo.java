package com.samsung.service;

import com.samsung.model.Person;
import com.samsung.model.Student;

public class PersonDemo {
    public static void demo() {
        Person p = new Person("Filipp", "Sadikov", 16);
        Student s = new Student("Filipp", "Sadikov", 16, "mp1", 1);
        PersonPrinter personPrinter = new PersonPrinter();
        personPrinter.printInfo(p);
        System.out.println("---------------------------------------------");
        StudentPrinter studentPrinter = new StudentPrinter();
        studentPrinter.printInfo(s);
    }
}
