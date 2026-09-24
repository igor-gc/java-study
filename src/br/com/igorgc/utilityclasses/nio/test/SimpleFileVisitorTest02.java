package br.com.igorgc.utilityclasses.nio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(
            Path file,
            BasicFileAttributes attributes
    ) {
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(
            Path directory,
            BasicFileAttributes attributes
    ) throws IOException {
        System.out.println("Pre visit " + directory.getFileName());
        return FileVisitResult.SKIP_SUBTREE;
    }

    @Override
    public FileVisitResult visitFileFailed(
            Path file,
            IOException exception
    ) throws IOException {
        return super.visitFileFailed(file, exception);
    }

    @Override
    public FileVisitResult postVisitDirectory(
            Path directory,
            IOException exception
    ) throws IOException {
        System.out.println("Post visit " + directory.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("folder");
        Files.walkFileTree(root, new ListAllFiles());
    }
}