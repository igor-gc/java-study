package br.com.igorgc.streams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Java", "Java", "API", "Stream");

        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String[]> collected = words.stream()
                .map(word -> word.split(""))
                .collect(Collectors.toList());

        Stream<String> stream = Arrays.stream(letters);

        List<String> letters2 = words.stream()
                .map(word -> word.split("")) // Stream<String[]>
                .flatMap(Arrays::stream) // Stream<String>
                .collect(Collectors.toList());

        System.out.println(letters2);
    }
}