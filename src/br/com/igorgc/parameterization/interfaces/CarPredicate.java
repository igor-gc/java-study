package br.com.igorgc.parameterization.interfaces;

import br.com.igorgc.parameterization.domain.Car;

@FunctionalInterface
public interface CarPredicate {
    // Anonymous classes, functions, concise syntax
    boolean test(Car car);

    // (parameter) -> <expression>
    // (Car car) -> car.getColor().equals("green");
}