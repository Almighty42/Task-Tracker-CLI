package org.personalprojects.taskTrackerCli.strategy;

public class Mark implements Strategy {
    @Override
    public void run() {
        System.out.println("You just ran the Mark command!");
    }
}