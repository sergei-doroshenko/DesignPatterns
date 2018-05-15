package org.sergei.design_patterns.creational.factory;

public class App {
    public static void main(String[] args) {
        CommandFactory factory = new CommandFactory();
        CommandExecutor executor = new CommandExecutor();

        BaseCommand baseCommand = factory.getCommand(CommandFactory.Type.BASE);
        String baseResult = executor.execute(baseCommand);
        System.out.println(baseResult);

        BaseCommand filterCommand = factory.getCommand(CommandFactory.Type.FILTER);
        String filterResult = executor.execute(filterCommand);
        System.out.println(filterResult);

        BaseCommand dynamicCommand = factory.getCommand(CommandFactory.Type.DYNAMIC);
        String dynamicResult = executor.execute(dynamicCommand);
        System.out.println(dynamicResult);

    }
}
