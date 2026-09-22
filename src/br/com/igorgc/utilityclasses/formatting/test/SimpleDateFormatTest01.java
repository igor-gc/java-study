package br.com.igorgc.utilityclasses.formatting.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Belo Horizonte' dd 'of' MMMM 'of' yyyy";

        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

        System.out.println(dateFormat.format(new Date()));

        try {
            System.out.println(
                    dateFormat.parse("Belo Horizonte 22 of September of 2026")
            );
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
