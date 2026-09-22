package br.com.igorgc.utilityclasses.formatting.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeJapan = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;

        NumberFormat[] numberFormats = new NumberFormat[4];

        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(localeJapan);
        numberFormats[2] = NumberFormat.getInstance(localeBrazil);
        numberFormats[3] = NumberFormat.getInstance(localeItaly);

        double value = 100_000_000.2130;

        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.format(value));
        }
    }
}