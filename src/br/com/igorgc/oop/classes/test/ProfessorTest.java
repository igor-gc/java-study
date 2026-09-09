package br.com.igorgc.oop.classes.test;

import br.com.igorgc.oop.classes.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Carlos";
        professor.age = 55;
        professor.gender = 'M';

        System.out.println("Name: " + professor.name + " Age: " + professor.age + " Gender: " + professor.gender);

    }
}
