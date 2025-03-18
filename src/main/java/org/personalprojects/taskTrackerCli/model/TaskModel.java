package org.personalprojects.taskTrackerCli.model;

import java.util.Date;
import java.util.UUID;

interface Task {
    void setName(String name);
    void setDesc(String description);
    void setStatus(String status);
    String get();
}

public class TaskModel implements Task {
    
    private static String id = UUID.randomUUID().toString();
    private static String name;
    private static String description;
    private static String status;
    private static Date createdAt = new Date();
    private static Date updatedAt = null;

    // Setters
    public void setName(String name) {
        this.name = name;
        this.updatedAt = new Date();
    }
    public void setDesc(String description) {
        this.description = description;
        this.updatedAt = new Date();
    }
    public void setStatus(String status) {
        if (status == "mark-in-progress" || status == "mark-done" || status == "mark-todo") {
            this.status = status;
            this.updatedAt = new Date();
        } else {
            // TODO tell user without throwing a error...
            throw new SecurityException("Status cannot be " + status + " it must be either mark-in-progress or mark-done or mark-todo");
        }
    }
    // Getter
    public String get() {
        return "";
    }

}
