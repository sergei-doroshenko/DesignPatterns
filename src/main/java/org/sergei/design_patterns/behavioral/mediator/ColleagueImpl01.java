package org.sergei.design_patterns.behavioral.mediator;

public class ColleagueImpl01 implements Colleague {

    private final Mediator mediator;

    public ColleagueImpl01(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getState() {
        return "One";
    }

    @Override
    public void action() {
        System.out.println(this.getClass().getSimpleName() + " executed an action...");
        this.mediator.mediate(this);
    }
}
