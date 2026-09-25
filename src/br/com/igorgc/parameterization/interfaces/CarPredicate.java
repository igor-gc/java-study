package br.com.igorgc.parameterization.interfaces;

import br.com.igorgc.parameterization.domain.Car;

public interface CarPredicate {
    boolean test(Car car);
}