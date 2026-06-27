package org.example.SomethingNew;

import java.util.Objects;
import java.util.Scanner;

public class Terminal {
    static void main() {
        Terminal terminal = new Terminal();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(terminal.showInterface());
            String command = scanner.nextLine();    //Сканнер

            if (Objects.equals(command, "exit")) {
                break;
            }
        }
    }

    String showInterface() {
        return "Перше слово – це команда, а наступні – аргументи" +
                "\n create([name],[content]) - Створити новий файл" +
                "\n mkdir([name]) - створити папку" +
                "\n delete([name]) - Видалити файл" +
                "\n find([substring]) - Знайти файли з частиною назви" +
                "\n ls - перегляд вмісту поточної папки" +
                "\n cd([name]) - войти в папку" +
                "\n exit - Зупинити процесс";
    }
}
