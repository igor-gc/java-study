package br.com.igorgc.utilityclasses.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder/file.txt");

        PosixFileAttributes attributes =
                Files.readAttributes(path, PosixFileAttributes.class);

        System.out.println(attributes.permissions());

        PosixFileAttributeView attributeView =
                Files.getFileAttributeView(
                        path,
                        PosixFileAttributeView.class
                );

        Set<PosixFilePermission> permissions =
                PosixFilePermissions.fromString("rw-rw-rw-");

        attributeView.setPermissions(permissions);

        System.out.println(
                attributeView.readAttributes().permissions()
        );
    }
}