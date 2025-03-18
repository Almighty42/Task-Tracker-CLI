package org.personalprojects.taskTrackerCli.strategy;

public class List implements Strategy {
    @Override
    public void run() {
        System.out.println("You just ran the List command!");
    }
}