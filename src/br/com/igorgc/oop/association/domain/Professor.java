package br.com.igorgc.oop.association.domain;

public class Professor {
    private String name;
    private String specialization;
    private Seminar[] seminars;

    public Professor(String name) {
        this.name = name;
    }

    public Professor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public Professor(String name, String specialization, Seminar[] seminars) {
        this.name = name;
        this.specialization = specialization;
        this.seminars = seminars;
    }

    public void print() {
        System.out.println("--------");
        System.out.println("Professor: " + this.name);

        if (this.seminars == null) return;

        System.out.println("## Registered seminars ##");

        for (Seminar seminar : this.seminars) {
            System.out.println(seminar.getTitle());
            System.out.println(seminar.getLocation().getAddress());

            if (seminar.getStudents() == null || seminar.getStudents().length == 0) {
                continue;
            }

            System.out.println("** Students **");

            for (Student student : seminar.getStudents()) {
                System.out.println(
                        "Student: " + student.getName()
                                + " Age: " + student.getAge()
                );
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}