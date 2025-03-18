package org.personalprojects.taskTrackerCli.strategy;

public class Update implements Strategy {
    @Override
    public void run() {
        System.out.println("You just ran the Update command!");
    }
}