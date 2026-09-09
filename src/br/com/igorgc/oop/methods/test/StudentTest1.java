package br.com.igorgc.oop.methods.test;

import br.com.igorgc.oop.methods.domain.Student;
import br.com.igorgc.oop.methods.domain.StudentPrinter;

public class StudentTest1 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Ana";
        student01.age = 15;
        student01.gender = 'F';

        student02.name = "Paul";
        student02.age = 16;
        student02.gender = 'M';

        student01.print();
        student02.print();
    }
}