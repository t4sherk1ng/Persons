package com.samsung.service;

import com.samsung.model.Person;

public class PersonPrinter implements Printer{
    @Override
    public void printInfo(Person p) {
        if (p.getPhone() == 0) {
            System.out.println("" + "Имя: " + p.getFirstName() + '\n' + "Фамилия: " + p.getSecondName() + '\n' + "Возраст: " + p.getAge());
        }
        else {
            System.out.println("" + "Имя: " + p.getFirstName() + '\n' + "Фамилия: " + p.getSecondName() + '\n' + "Возраст: " + p.getAge() + '\n' + "Телефон: " + p.getPhone());
        }

    }
}
