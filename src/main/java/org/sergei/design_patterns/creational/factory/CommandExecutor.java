package org.sergei.design_patterns.creational.factory;

public class CommandExecutor {

    public String execute(BaseCommand command) {
        return "Execute: " + command.getClass().getName();
    }
}
