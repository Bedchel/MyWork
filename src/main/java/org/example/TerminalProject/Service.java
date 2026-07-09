package org.example.TerminalProject;

import org.example.TerminalProject.Model.File;

import java.util.List;

public interface Service {
    List<String> ls();

    void mkdir(String name);

    boolean cd(String path);

    File create(String name, String content);

    boolean deleteFile(String name);

    List<File> findFile(String substring);
}
