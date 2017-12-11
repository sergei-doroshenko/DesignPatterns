package org.sergei.design_patterns.behavioral.mediator;

public class ColleagueImpl02 implements Colleague {

    private final Mediator mediator;

    public ColleagueImpl02(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getState() {
        return "Two";
    }

    @Override
    public void action() {
        System.out.println(this.getClass().getSimpleName() + " executed an action...");
        this.mediator.mediate(this);
    }
}
