package org.example.TerminalProject.Model;

import java.util.List;

public class Folder {
    private String name;
    private Folder parent;

    private List<Folder> subFolder;
    private List<File> contentFolder;

    public String getName() {
        return name;
    }

    public Folder getParent() {
        return parent;
    }

    public List<Folder> getSubFolders() {
        return subFolder;
    }

    public List<File> getContentFolder() {
        return contentFolder;
    }

    public void addFile(File file) {
        contentFolder.add(file);
    }

    public void addFolder(Folder folder) {
        subFolder.add(folder);
    }

    public boolean removeElement(String name) {
        for (File file : contentFolder) {
            if (file.name().equals(name)) {
                contentFolder.remove(file);
                return true;
            }
        }
        return false;
    }
}
