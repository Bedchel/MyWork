package org.example.TerminalProject;

import org.example.TerminalProject.Service;

import java.util.Scanner;

public class Terminal {

    Scanner scanner = new Scanner(System.in);
    Controller controller = new Controller(new FileService());

    static void main() {
        Terminal terminal = new Terminal();
        terminal.controller.start();
    }

    void createFile() {
        System.out.println("Напишить назву:");
        String name = scanner.nextLine();
        System.out.println("Напишить контент внутри");
        String contentInside = scanner.nextLine();
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
    }
}
