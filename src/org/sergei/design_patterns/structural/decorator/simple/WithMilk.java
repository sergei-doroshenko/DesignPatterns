package org.sergei.design_patterns.structural.decorator.simple;

/**
 * Created by Sergei on 20.08.2015.
 */
public class WithMilk implements Coffee {

    private Coffee coffee;

    public WithMilk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return this.coffee.getCost() + 0.5;
    }

    @Override
    public String getIngredients() {
        return this.coffee.getIngredients() + " Milk";
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }
}
