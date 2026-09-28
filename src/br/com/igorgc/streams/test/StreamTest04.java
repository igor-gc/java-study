package br.com.igorgc.streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> teams = new ArrayList<>();
        List<String> designers = List.of("Alice", "Bob", "Charlie");
        List<String> developers = List.of("David", "Edward", "Frank");
        List<String> students = List.of("Grace", "Helen", "Ian", "Jack");

        teams.add(designers);
        teams.add(developers);
        teams.add(students);

        for (List<String> people : teams) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("----");

        teams.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}