package br.com.igorgc.optional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Hello");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("-------");

        Optional<String> nameOptional = findName("Alice");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
        nameOptional.ifPresent(name -> System.out.println(name.toUpperCase()));
    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("Alice", "Bob");
        int index = list.indexOf(name);

        if (index != -1) {
            return Optional.of(list.get(index));
        }

        return Optional.empty();
    }
}