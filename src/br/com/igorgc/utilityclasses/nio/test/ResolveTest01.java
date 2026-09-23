package br.com.igorgc.utilityclasses.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path directory = Paths.get("home/igor");
        Path file = Paths.get("dev/file.txt");

        Path resolvedPath = directory.resolve(file);
        System.out.println(resolvedPath);

        Path absolute = Paths.get("/home/igor");
        Path relative = Paths.get("dev");
        Path fileRelative = Paths.get("file.txt");

        System.out.println("1 " + absolute.resolve(relative));
        System.out.println("2 " + absolute.resolve(fileRelative));
        System.out.println("3 " + relative.resolve(absolute));
        System.out.println("4 " + relative.resolve(fileRelative));
        System.out.println("5 " + fileRelative.resolve(absolute));
        System.out.println("6 " + fileRelative.resolve(relative));
    }
}
