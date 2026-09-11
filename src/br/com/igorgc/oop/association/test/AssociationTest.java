package br.com.igorgc.oop.association.test;

import br.com.igorgc.oop.association.domain.Location;
import br.com.igorgc.oop.association.domain.Professor;
import br.com.igorgc.oop.association.domain.Seminar;
import br.com.igorgc.oop.association.domain.Student;

public class AssociationTest {
    public static void main(String[] args) {
        Location location = new Location("Orange Street");

        Student student = new Student("Pedro", 17);
        Student[] studentsForSeminar = {student};

        Seminar seminar = new Seminar("Calc", studentsForSeminar, location
        );

        Seminar[] availableSeminars = {seminar};

        Professor professor = new Professor("Pascal", "Math");
        professor.setSeminars(availableSeminars);

        professor.print();
    }
}