package org.example.TerminalProject;

import org.example.TerminalProject.Model.File;

import java.util.List;

public class FileService implements Service{
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
        return null;
    }

    @Override
    public boolean deleteFile(String name) {
        return false;
    }

    @Override
    public List<File> findFile(String substring) {
        return List.of();
    }
}
