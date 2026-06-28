package org.example.Repeating.TryCatchLevel1;

import java.util.Objects;
import java.util.Scanner;

public class ResourcheManager {
    Scanner scanner = new Scanner(System.in);

    public void process(String data) throws ResourceAccessDeniedException {
        if (Objects.equals(data.toUpperCase(), "")) {
            throw new ResourceAccessDeniedException("Воно пусте!");
        } else if (data.contains("CRITICAL")) {
            throw new SystemCorruptedException("КРИТИЧНА ПОМИЛКА!!!");
        }
    }

    static void main() {
        ResourcheManager resourcheManager = new ResourcheManager();
        System.out.println("Напишить текст:");
        try {
            resourcheManager.process(resourcheManager.scanner.nextLine().toUpperCase());
        } catch (ResourceAccessDeniedException re) {
            System.err.println("Зловлено checked виняток: " + re.getMessage());
        } catch (SystemCorruptedException se) {
            System.err.println("Зловлено unchecked виняток: " + se.getMessage());
        } finally {
            System.out.println("Обробка завершена");
        }
    }
}
