package org.sergei.design_patterns.creational.factory;

public class CommandFactory {

    public BaseCommand getCommand(Type type) {
        switch (type) {
            case FILTER: return new FilterCommand();
            case DYNAMIC: return new DynamicCommand();
            default: return new BaseCommand();
        }
    }

    enum Type { BASE, FILTER, DYNAMIC}
}
