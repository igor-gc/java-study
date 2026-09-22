package br.com.igorgc.utilityclasses.formatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSwitzerland = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeNetherlands = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();

        DateFormat dateFormatItaly =
                DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateFormatSwitzerland =
                DateFormat.getDateInstance(DateFormat.FULL, localeSwitzerland);
        DateFormat dateFormatIndia =
                DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateFormatJapan =
                DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat dateFormatNetherlands =
                DateFormat.getDateInstance(DateFormat.FULL, localeNetherlands);

        System.out.println("Italy: " + dateFormatItaly.format(calendar.getTime()));
        System.out.println("Switzerland: " + dateFormatSwitzerland.format(calendar.getTime()));
        System.out.println("India: " + dateFormatIndia.format(calendar.getTime()));
        System.out.println("Japan: " + dateFormatJapan.format(calendar.getTime()));
        System.out.println("Netherlands: " + dateFormatNetherlands.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeJapan));
        System.out.println(localeSwitzerland.getDisplayCountry(localeNetherlands));
        System.out.println(localeItaly.getDisplayLanguage(localeJapan));
    }
}
