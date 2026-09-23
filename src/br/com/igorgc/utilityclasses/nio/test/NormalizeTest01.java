package br.com.igorgc.utilityclasses.nio.test;


import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String directory = "home/igor/dev";
        String fileTxt = "../../file.txt";

        Path path1 = Paths.get(directory, fileTxt);

        System.out.println(path1);
        System.out.println(path1.normalize());

        Path path2 = Paths.get("/home/./igor/./dev/");

        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}