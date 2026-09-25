package br.com.igorgc.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Alice", "Bob");
        List<Integer> integers = map(strings, (String s) -> s.length());
        List<String> mappedStrings = map(strings, s -> s.toUpperCase());

        System.out.println(integers);
        System.out.println(mappedStrings);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();

        for (T element : list) {
            R resultElement = function.apply(element);
            result.add(resultElement);
        }

        return result;
    }
}