package org.sergei.design_patterns.behavioral.mediator;

public class App {

    public static void main(String[] args) {

        Colleague colleague01 = null;
        Colleague colleague02 = null;

        Mediator mediator01 = new MedatorImpl("M1", colleague01);
        Mediator mediator02 = new MedatorImpl("M2", colleague02);

        colleague01 = new ColleagueImpl01(mediator02);
        colleague02 = new ColleagueImpl02(mediator01);

        colleague01.action();
        colleague02.action();
    }

}
