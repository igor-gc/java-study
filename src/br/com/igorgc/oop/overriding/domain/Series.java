package br.com.igorgc.oop.overriding.domain;

public class Series extends Object {

    private String name;

    @Override
    public String toString() {
        return "Series{" +
                "name='" + name + '\'' +
                '}';
    }

    public Series(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
