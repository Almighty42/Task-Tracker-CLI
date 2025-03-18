package org.personalprojects.taskTrackerCli.strategy;

interface Strategy {
    void run();
}

public class Context {
    private Strategy strategy;

    public void set(Strategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.run();
    }
}