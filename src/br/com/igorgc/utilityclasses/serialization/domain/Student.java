package br.com.igorgc.utilityclasses.serialization.domain;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = 739959230178355186L;

    private Long id;
    private String name;
    private transient String password;

    private static final String SCHOOL_NAME = "Java Academy";

    private transient ClassGroup classGroup;

    public Student(Long id, String name, String password) {
        System.out.println("Inside constructor");
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream outputStream) {
        try {
            outputStream.defaultWriteObject();
            outputStream.writeUTF(classGroup.getName());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream inputStream) {
        try {
            inputStream.defaultReadObject();

            String classGroupName = inputStream.readUTF();
            classGroup = new ClassGroup(classGroupName);

        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", SCHOOL_NAME='" + SCHOOL_NAME + '\'' +
                ", classGroup=" + classGroup +
                '}';
    }

    public ClassGroup getClassGroup() {
        return classGroup;
    }

    public void setClassGroup(ClassGroup classGroup) {
        this.classGroup = classGroup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}