package br.com.igorgc.utilityclasses.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder2/new.txt");

        BasicFileAttributes attributes =
                Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = attributes.creationTime();
        FileTime lastModifiedTime = attributes.lastModifiedTime();
        FileTime lastAccessTime = attributes.lastAccessTime();

        System.out.println("Creation time: " + creationTime);
        System.out.println("Last modified time: " + lastModifiedTime);
        System.out.println("Last access time: " + lastAccessTime);
        System.out.println("----------------");

        BasicFileAttributeView attributeView =
                Files.getFileAttributeView(
                        path,
                        BasicFileAttributeView.class
                );

        FileTime newCreationTime =
                FileTime.fromMillis(System.currentTimeMillis());

        attributeView.setTimes(
                lastModifiedTime,
                newCreationTime,
                creationTime
        );

        creationTime = attributeView.readAttributes().creationTime();
        lastModifiedTime = attributeView.readAttributes().lastModifiedTime();
        lastAccessTime = attributeView.readAttributes().lastAccessTime();

        System.out.println("Creation time: " + creationTime);
        System.out.println("Last modified time: " + lastModifiedTime);
        System.out.println("Last access time: " + lastAccessTime);
    }
}