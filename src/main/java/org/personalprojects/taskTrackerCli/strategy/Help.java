package org.personalprojects.taskTrackerCli.strategy;

public class Help implements Strategy {
    @Override
    public void run() {
        System.out.println("You just ran the Help command!");
    }
}