package br.com.igorgc.utilityclasses.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path folderPath = Paths.get("folder");

        if (Files.notExists(folderPath)) {
            Files.createDirectory(folderPath);
        }

        Path subfolderPath = Paths.get("folder/subfolder/subsubfolder");
        Files.createDirectories(subfolderPath);

        Path filePath = Paths.get(subfolderPath.toString(), "file.txt");

        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(
                filePath.getParent().toString(),
                "renamed_file.txt"
        );

        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}