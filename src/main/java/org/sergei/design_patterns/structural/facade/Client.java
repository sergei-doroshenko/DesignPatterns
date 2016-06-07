package org.sergei.design_patterns.structural.facade;

/**
 * Created by Sergei on 08.09.2015.
 */
public class Client {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
    }
}
