package br.com.igorgc.utilityclasses.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder/test.txt");

        if (Files.notExists(path)) {
            Files.createFile(path);
        }

        DosFileAttributes attributes =
                Files.readAttributes(path, DosFileAttributes.class);

        System.out.println("Hidden: " + attributes.isHidden());
        System.out.println("Read-only: " + attributes.isReadOnly());

        DosFileAttributeView attributeView =
                Files.getFileAttributeView(
                        path,
                        DosFileAttributeView.class
                );

        attributeView.setHidden(true);
        attributeView.setReadOnly(true);

        System.out.println(
                "Hidden: " + attributeView.readAttributes().isHidden()
        );
        System.out.println(
                "Read-only: " + attributeView.readAttributes().isReadOnly()
        );
    }
}