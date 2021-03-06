package org.sergei.design_patterns.behavioral.observer;

/**
 * Created by Sergei on 31.07.2015.
 */
public class ObserverB implements Observer {
    private Observer.State state = State.DETACHED;

    @Override
    public void update(String message) {
        System.out.println("ObserverB get message: " + message);
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public void setState(State state) {
        System.out.println("ObserverA change state from: " + this.state + " to: " + state);
        this.state = state;
    }
}
