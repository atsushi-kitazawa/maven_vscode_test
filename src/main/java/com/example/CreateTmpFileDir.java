package com.example;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

public class CreateTmpFileDir {

    public static void main(String[] args) throws Exception {
        deleteOnExit("prefix_");
        createTmpFile();
        createTmpDir();
    }

    public static void createTmpFile() throws IOException {
        Files.createTempFile(new File(".").toPath(), "prefix_", null);
    }

    public static void createTmpDir() throws IOException {
        Files.createTempDirectory(new File(".").toPath(), "prefix_");
    }

    public static void deleteOnExit(String prefix) {
        File[] files = new File(".").listFiles(new FileFilter(){
            public boolean accept(File pathname) {
                return pathname.getName().startsWith(prefix);
            }
        });

        Arrays.asList(files).stream().forEach(f -> f.delete());
    }
}
