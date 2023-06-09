package main.ex1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private List<String> lines;

    public FileHandler() {
        this.lines = new ArrayList<>();
    }

    public List<String> loadFileContent(String path) {
        List<String> fileContent = new ArrayList<>();
        try {
            fileContent = Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }

    public List<String> readFileContent(String path) {
        if (!isPathEmpty(path)) {
            lines = loadFileContent(path);
        }
        return lines;
    }

    public boolean isPathEmpty(String path) {
        return path == null || path.trim().isEmpty();
    }
}

