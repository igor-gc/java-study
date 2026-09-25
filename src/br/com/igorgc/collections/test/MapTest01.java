package br.com.igorgc.collections.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("admin", "Administrator");
        map.put("professor", "Professor");
        map.put("aluno", "Student");
        map.putIfAbsent("guest", "Guest");

        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("-------------");

        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("----------");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}