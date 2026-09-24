package br.com.igorgc.utilityclasses.serialization.test;

import br.com.igorgc.utilityclasses.serialization.domain.ClassGroup;
import br.com.igorgc.utilityclasses.serialization.domain.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {

    public static void main(String[] args) {
        Student student = new Student(1L, "Alice", "123412121");

        ClassGroup classGroup =
                new ClassGroup("Java Backend");

        student.setClassGroup(classGroup);

        serialize(student);
        deserialize();
    }

    private static void serialize(Student student) {
        Path path = Paths.get("folder/student.ser");

        try (
                ObjectOutputStream outputStream =
                        new ObjectOutputStream(Files.newOutputStream(path))
        ) {
            outputStream.writeObject(student);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void deserialize() {
        Path path = Paths.get("folder/student.ser");

        try (
                ObjectInputStream inputStream =
                        new ObjectInputStream(Files.newInputStream(path))
        ) {
            Student student = (Student) inputStream.readObject();
            System.out.println(student);

        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}