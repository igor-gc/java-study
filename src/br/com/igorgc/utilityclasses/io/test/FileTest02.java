package br.com.igorgc.utilityclasses.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File directory = new File("folder");
        boolean isDirectoryCreated = directory.mkdir();
        System.out.println("Directory created? " + isDirectoryCreated);

        File fileInDirectory = new File(directory, "file.txt");
        boolean isFileCreated = fileInDirectory.createNewFile();
        System.out.println("file.txt created? " + isFileCreated);

        File renamedFile = new File(directory, "renamed_file.txt");
        boolean isRenamed = fileInDirectory.renameTo(renamedFile);
        System.out.println("File renamed? " + isRenamed);

        File renamedDirectory = new File("folder2");
        boolean isDirectoryRenamed = directory.renameTo(renamedDirectory);
        System.out.println("Directory renamed? " + isDirectoryRenamed);
    }
}
