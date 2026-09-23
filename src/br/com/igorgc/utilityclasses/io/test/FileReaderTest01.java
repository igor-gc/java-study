package br.com.igorgc.utilityclasses.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileReader fileReader = new FileReader(file)) {
//            char[] input = new char[30];
//            fileReader.read(input);
//            for (char character : input) {
//                System.out.print(character);
//            }

            int characterCode;

            while ((characterCode = fileReader.read()) != -1) {
                System.out.print((char) characterCode);
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}