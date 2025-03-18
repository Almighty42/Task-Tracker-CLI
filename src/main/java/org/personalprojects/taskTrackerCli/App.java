package org.personalprojects.taskTrackerCli;

import java.util.Scanner;

import org.personalprojects.taskTrackerCli.controller.TaskController;
import org.personalprojects.taskTrackerCli.view.TaskView;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskView.displayWelcome();
        TaskController.menu(scanner);
        scanner.close();
    }
}
