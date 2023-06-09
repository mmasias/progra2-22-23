package main.utils;

import main.exceptions.EmptyException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private List<String> lines;

    public FileHandler(){
        this.lines = new ArrayList<>();
    }
// path  = ""
    public List<String> loadFileContent(String path) throws EmptyException {
        if (isPathEmpty(path)) {
            throw new EmptyException();
        }

        File file = new File(path);
        if (!file.exists()) {
            System.err.println("File not found");
            return null;
        }

        return readFileContent(path);
    }

    private boolean isPathEmpty(String path) {
        return path.isEmpty();
    }

    private List<String> readFileContent(String path) {
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(path));
            try {
                String line;
                while ((line = input.readLine()) != null) {
                    this.lines.add(line);
                }
            } catch (IOException e) {
                System.err.println("Error reading file");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.err.println("Error closing file");
                }
            }
        }
        return this.lines;
    }

}
