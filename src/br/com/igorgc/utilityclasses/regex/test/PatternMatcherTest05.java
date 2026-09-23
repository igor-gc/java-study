package br.com.igorgc.utilityclasses.regex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = All digits
        // \D = Everything that is not a digit
        // \s = Whitespace characters \t \n \f \r
        // \S = All characters excluding whitespace
        // \w = [a-zA-Z0-9_]
        // \W = Everything that is not included in \w
        // []
        // ? Zero or one
        // * Zero or more
        // + One or more
        // {n,m} From n to m
        // ()
        // |
        // $
        // . 1.3 = 123, 133, 1@3, 1A3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "pedro@hotmail.com, 123gabriel@gmail.com, #@!paulo@mail.br, test@gmail.com.br, sarah@mail";

        System.out.println("Valid email");
        System.out.println("#@!paulo@mail.br".matches(regex));
        System.out.println(text.split(",")[1].trim());

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Text:  " + text);
        System.out.println("Index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found:");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}