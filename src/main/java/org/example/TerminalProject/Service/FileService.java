package org.example.TerminalProject.Service;

import org.example.TerminalProject.Model.Files;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

public class FileService {
    ArrayList<Files> filesList = new ArrayList<>();

    public Files createFile(String name, String content) {
        Files newFiles = new Files(name, content);
        filesList.add(newFiles);
        return newFiles;
    }

    public String showContent(String name) {
        for (Files filesNum : filesList) {
            if (Objects.equals(filesNum.name(), name)) {
                return filesNum.content();
            }
        }
        return "No Files found";
    }
}
