package org.personalprojects.taskTrackerCli.utils;

import org.personalprojects.taskTrackerCli.strategy.Add;
import org.personalprojects.taskTrackerCli.strategy.Context;
import org.personalprojects.taskTrackerCli.strategy.Help;
import org.personalprojects.taskTrackerCli.strategy.List;
import org.personalprojects.taskTrackerCli.strategy.Mark;
import org.personalprojects.taskTrackerCli.strategy.Update;

public class Utils {
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    public static void handleContext(String userInput) {
        Context context = new Context();
        // TODO tell user without throwing a error...
        if (userInput.length() < 3) {
            throw new SecurityException("Incorrect input");
        }
        // TODO Check if add is the first word of the command logic...
        if (userInput.matches("add\\s")) { context.set(new Add()); }
        else if ("update".equals(userInput.substring(0, 6))) { context.set(new Update()); }
        else if ("list".equals(userInput.substring(0, 4))) { context.set(new List()); }
        else if ("mark".equals(userInput.substring(0, 4))) { context.set(new Mark()); }
        else if ("help".equals(userInput.substring(0, 4))) { context.set(new Help()); }
        else { System.out.println("Incorrect input"); }
        context.run();
    }
}
