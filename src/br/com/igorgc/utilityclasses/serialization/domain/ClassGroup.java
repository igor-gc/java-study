package br.com.igorgc.utilityclasses.serialization.domain;

public class ClassGroup {

    private String name;

    public ClassGroup(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassGroup{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}