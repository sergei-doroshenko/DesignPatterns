package org.sergei.design_patterns.behavioral.mediator;

public class MedatorImpl implements Mediator {

    private Colleague colleague;
    private String name;

    public MedatorImpl() {
    }

    public MedatorImpl(String name, Colleague colleague) {
        this.name = name;
        this.colleague = colleague;
    }

    @Override
    public void mediate(Colleague colleague) {
        System.out.println(String.format(
                "%s fired action on %s with state: %s",
                name,
                colleague.getClass().getSimpleName(),
                colleague.getState()));
    }
}
