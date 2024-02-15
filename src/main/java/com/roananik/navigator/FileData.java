package com.roananik.navigator;

import java.util.*;

public class FileData {
    private String name;
    private long size;
    private String path;

    public FileData(String name, long size, String path) {
        this.name = name;
        this.size = size;
        this.path = path;
    }


    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public String getPath() {
        return path;
    }
}

 class FileNavigator {
    private Map<String, List<FileData>> filesByPath;

    public FileNavigator() {
        filesByPath = new HashMap<>();
    }

    public void add(String path, FileData file) {
        if (!filesByPath.containsKey(path)) {
            filesByPath.put(path, new ArrayList<>());
        }
        filesByPath.get(path).add(file);
    }

    public List<FileData> find(String path) {
        return filesByPath.getOrDefault(path, new ArrayList<>());
    }

    public List<FileData> filterBySize(String path, long maxSize) {
        List<FileData> files = filesByPath.getOrDefault(path, new ArrayList<>());
        List<FileData> filteredFiles = new ArrayList<>();
        for (FileData file : files) {
            if (file.getSize() <= maxSize) {
                filteredFiles.add(file);
            }
        }
        return filteredFiles;
    }

    public void remove(String path) {
        filesByPath.remove(path);
    }

    public List<FileData> sortBySize(String path) {
        List<FileData> files = filesByPath.getOrDefault(path, new ArrayList<>());
        files.sort(Comparator.comparingLong(FileData::getSize));
        return files;
    }

    public void addWithConsistencyCheck(String path, FileData file) {
        if (!path.equals(file.getPath())) {
            System.out.println("Error: Path-key and file path do not match!");
            return;
        }
        add(path, file);
    }

    public static void main(String[] args) {
        FileNavigator navigator = new FileNavigator();
        FileData file1 = new FileData("files.txt", 100, "/path/to/file");
        FileData file2 = new FileData("firstApp.java", 200, "/path/to/file");
        FileData file3 = new FileData("anotherFile.txt", 150, "/another/path");

        navigator.addWithConsistencyCheck("/path/to/file", file1);
        navigator.addWithConsistencyCheck("/path/to/file", file2);
        navigator.addWithConsistencyCheck("/another/path", file3);


        List<FileData> filesAtPath = navigator.find("/path/to/file");
        System.out.println("Files at /path/to/file: " + filesAtPath);


        List<FileData> filteredFiles = navigator.filterBySize("/path/to/file", 150);
        System.out.println("Filtered files at /path/to/file: " + filteredFiles);


        navigator.remove("/path/to/file");


        navigator.addWithConsistencyCheck("/path/to/file", file3);
    }
}






