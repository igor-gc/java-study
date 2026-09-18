package br.com.igorgc.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {

    public static void main(String[] args) {
        createCustomFile();
    }

    private static void createCustomFile() {
        File file = new File("folder/test.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(
                    "Something happened while creating the file", e
            );
        }

        System.out.println("Outside custom file creator");
    }
}