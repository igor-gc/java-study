package br.com.igorgc.utilityclasses.formatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeJapan = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;

        NumberFormat[] numberFormats = new NumberFormat[4];

        numberFormats[0] = NumberFormat.getCurrencyInstance();
        numberFormats[1] = NumberFormat.getCurrencyInstance(localeJapan);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localeBrazil);
        numberFormats[3] = NumberFormat.getCurrencyInstance(localeItaly);

        double value = 1000.2130;

        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(value));
        }

        String valueString = "1,000";

        try {
            System.out.println(numberFormats[1].parse(valueString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}