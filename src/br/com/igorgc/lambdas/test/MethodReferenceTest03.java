package br.com.igorgc.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));

        list.sort(String::compareTo);
        System.out.println(list);

        Function<String, Integer> stringToInteger = Integer::parseInt;
        Integer number = stringToInteger.apply("10");
        System.out.println(number);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Alice"));
    }
}