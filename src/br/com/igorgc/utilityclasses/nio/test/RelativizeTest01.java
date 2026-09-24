package br.com.igorgc.utilityclasses.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path directory = Paths.get("/home/igor");
        Path file = Paths.get("/home/igor/project/HelloWorld.java");

        Path pathToFile = directory.relativize(file);
        System.out.println(pathToFile);

        Path absolute1 = Paths.get("/home/igor");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/igor/project/HelloWorld.java");

        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/temp.2021921");

        System.out.println("1 " + absolute1.relativize(absolute3));
        System.out.println("2 " + absolute3.relativize(absolute1));
        System.out.println("3 " + absolute1.relativize(absolute2));
        System.out.println("4 " + relative1.relativize(relative2));
        System.out.println("5 " + absolute1.relativize(relative1));
    }
}
