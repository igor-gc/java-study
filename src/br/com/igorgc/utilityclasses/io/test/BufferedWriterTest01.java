package br.com.igorgc.utilityclasses.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write("Java is a powerful programming language.");
            bufferedWriter.newLine();
            bufferedWriter.flush();

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
