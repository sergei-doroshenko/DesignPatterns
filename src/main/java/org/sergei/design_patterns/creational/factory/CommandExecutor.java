package org.sergei.design_patterns.creational.factory;

public class CommandExecutor {

    public String execute(BaseCommand command) {
        if (command instanceof FilterCommand) {
            return execute((FilterCommand) command);
        } else if (command instanceof DynamicCommand) {
            return execute((DynamicCommand) command);
        } else {
            return "Execute B: " + command.getClass().getName();
        }
    }

    public String execute(FilterCommand command) {
        return "Execute F: " + command.getClass().getName();
    }

    public String execute(DynamicCommand command) {
        return "Execute D: " + command.getClass().getName();
    }
}
