package br.com.igorgc.utilityclasses.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "12 0x 0X 0xFFABC 0x10G 0x1";

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