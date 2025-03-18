package org.personalprojects.taskTrackerCli.controller;

import java.util.Scanner;

import org.personalprojects.taskTrackerCli.utils.Utils;

public final class TaskController {
    public static void menu(Scanner scanner) {

        while (true) { 
            
            System.out.print("task-cli > ");
            String userInput = scanner.next();
            Utils.handleContext(userInput);

        }

    }
}