package org.sergei.design_patterns.creational.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandFactoryTest {

    @Test
    public void commandExecutionTest() {
        CommandFactory factory = new CommandFactory();
        CommandExecutor executor = new CommandExecutor();

        BaseCommand baseCommand = factory.getCommand(CommandFactory.Type.BASE);
        String baseResult = executor.execute(baseCommand);
        assertEquals("Execute: " + BaseCommand.class.getName(), baseResult);

        BaseCommand filterCommand = factory.getCommand(CommandFactory.Type.FILTER);
        String filterResult = executor.execute(filterCommand);
        assertEquals("Execute: " + FilterCommand.class.getName(), filterResult);

        BaseCommand dynamicCommand = factory.getCommand(CommandFactory.Type.DYNAMIC);
        String dynamicResult = executor.execute(dynamicCommand);
        assertEquals("Execute: " + DynamicCommand.class.getName(), dynamicResult);

    }

}