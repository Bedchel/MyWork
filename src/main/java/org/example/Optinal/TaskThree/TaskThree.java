package org.example.Optinal.TaskThree;

public class TaskThree {
    static void main() {
        AppConfig appConfig = new AppConfig(null);
        System.out.println(appConfig.getRequiredDbUrl(appConfig));
    }
}
