package org.example.TerminalProject;

import org.example.TerminalProject.Model.File;
import org.example.TerminalProject.Model.Folder;

import java.util.List;

public class FileService implements Service {
    Folder root;
    Folder currentDirectory;


    public FileService() {
        root = new Folder("C:/", null);
        currentDirectory = root;
    }

    @Override
    public List<String> ls() {
        return List.of();
    }

    @Override
    public void mkdir(String name) {

    }

    @Override
    public boolean cd(String path) {
        return false;
    }

    @Override
    public File create(String name, String content) {
        File file = new File(name, content);
        return file;
    }

    @Override
    public boolean deleteFile(String name) {
        return false;
    }

    @Override
    public List<File> findFile(String substring) {
        return List.of();
    }

    public Folder getRoot() {
        return root;
    }

    public void setRoot(Folder root) {
        this.root = root;
    }

    public Folder getCurrentDirectory() {
        return currentDirectory;
    }

    public void setCurrentDirectory(Folder currentDirectory) {
        this.currentDirectory = currentDirectory;
    }
}
