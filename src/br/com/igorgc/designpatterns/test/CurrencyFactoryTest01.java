package br.com.igorgc.designpatterns.test;

import br.com.igorgc.designpatterns.domain.Country;
import br.com.igorgc.designpatterns.domain.Currency;
import br.com.igorgc.designpatterns.domain.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}