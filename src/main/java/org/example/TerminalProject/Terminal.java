package org.example.TerminalProject;

import org.example.TerminalProject.Service.FileService;

import java.util.Scanner;

public class Terminal {
    FileService fileService = new FileService();
    Scanner scanner = new Scanner(System.in);

    static void main() {
        Terminal terminal = new Terminal();
        while (true) {
            System.out.println(terminal.showInterface());
            String command = terminal.scanner.nextLine();
            terminal.chooseTheMethod(command);
        }
    }

    String showInterface() {
        return "Комманди:" +
                "\n create - Створити новий файл" +
                "\n mkdir - створити папку" +
                "\n delete - Видалити файл" +
                "\n find - Знайти файли з частиною назви" +
                "\n ls - перегляд вмісту поточної папки" +
                "\n cd - войти в папку" +
                "\n sfc - показати контент файла" +
                "\n exit - Зупинити процесс" +
                "\n";
    }

    void createFile() {
        System.out.println("Напишить назву:");
        String name = scanner.nextLine();
        System.out.println("Напишить контент внутри");
        String contentInside = scanner.nextLine();
        fileService.createFile(name, contentInside);
    }

    void createFolder() {
        System.out.println("Напишить назву:");
        String folderName = scanner.nextLine();
    }

    void deleteFile() {
        System.out.println("Напишить назву для видалення:");
        String nameForDeleting = scanner.nextLine();

    }

    void find() {
        System.out.println("Напишить частину назви для поіска:");
        String nameForSearching = scanner.nextLine();
    }

    void showFolderContent() {
        System.out.println("Напишить назву папки для показу вміста:");
        String folderNameForContentInside = scanner.nextLine();
    }

    void goInFolder() {
        System.out.println("Напишить назву папки для показу вміста:");
        String folderNameToGoIn = scanner.nextLine();
    }

    void showFileContent() {
        System.out.println("Напишить назву файла для показу контента:");
        String nameForShowing = scanner.nextLine();
        fileService.showContent(nameForShowing);
    }

    void chooseTheMethod(String command) {
        switch (command.toLowerCase()) {
            case "create":
                createFile();
                break;
            case "mkdir":
                createFolder();
                break;
            case "delete":
                deleteFile();
                break;
            case "find":
                find();
                break;
            case "ls":
                showFolderContent();
                break;
            case "cd":
                goInFolder();
                break;
            case "sfc":
                showFileContent();
                break;
            case "exit":
                System.exit(0);
        }
    }
}
