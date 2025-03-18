package org.personalprojects.taskTrackerCli.strategy;

public class Add implements Strategy {
    @Override
    public void run() {
        System.out.println("You just ran the Add command!");
    }
}