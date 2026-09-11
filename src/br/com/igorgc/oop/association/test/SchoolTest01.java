package br.com.igorgc.oop.association.test;

import br.com.igorgc.oop.association.domain.Professor;
import br.com.igorgc.oop.association.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jake");
        Professor[] professors = {professor};
        School school = new School("Hope", professors);

        school.print();
    }

}
