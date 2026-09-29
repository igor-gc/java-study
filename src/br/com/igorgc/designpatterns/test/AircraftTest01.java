package br.com.igorgc.designpatterns.test;

import br.com.igorgc.designpatterns.domain.Aircraft;
import br.com.igorgc.designpatterns.domain.AircraftSingletonEager;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEager.getINSTANCE());
//        Aircraft aircraft = new Aircraft("787-900");
//        System.out.println(aircraft.bookSeat(seat));
    }
}