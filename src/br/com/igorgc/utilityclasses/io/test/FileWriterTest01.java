package br.com.igorgc.utilityclasses.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("Java is a powerful programming language.\n" + "This text is written to the file.\n");
            fileWriter.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}