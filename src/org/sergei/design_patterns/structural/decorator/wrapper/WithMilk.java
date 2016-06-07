package org.sergei.design_patterns.structural.decorator.wrapper;

/**
 * Created by Sergei on 20.08.2015.
 */
public class WithMilk extends CoffeeWrapper {

    public WithMilk(Coffee coffee) {
        super(0.5, "Milk", coffee);
    }
}
