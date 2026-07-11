package org.example.TerminalProject;

import org.example.TerminalProject.Model.File;

import java.util.List;
import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    public void start() {

        System.out.println(showInterface());
        while (true) {
            String command = scanner.nextLine();
            handleCommand(command);
        }
    }

    String showInterface() {
        return """
                
                Комманди:\
                
                 create - Створити новий файл\
                
                 mkdir - створити папку\
                
                 delete - Видалити файл\
                
                 find - Знайти файли з частиною назви\
                
                 ls - перегляд вмісту поточної папки\
                
                 cd - войти в папку\
                
                 sfc - показати контент файла\
                
                 exit - Зупинити процесс\
                
                """;
    }

    private void handleCommand(String input) {
        switch (input.toLowerCase()) {
            case "create":
                break;
            case "mkdir":
                break;
            case "delete":
                break;
            case "find":
                break;
            case "ls":
                break;
            case "cd":
                break;
            case "sfc":
                break;
            case "exit":
                System.exit(0);
            default:
                System.out.println("Напишить комманду:");
        }

    }

    public void mkdir(String name) {
    }

    public boolean cd(String path) {
        return false;
    }

    public File createFile(String name, String content) {
        return null;
    }

    public boolean deleteFile(String name) {
        return false;
    }

    public List<File> findFile(String substring) {
        return null;
    }
}