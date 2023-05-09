package main.utils;

import main.exceptions.EmptyException;
import main.exceptions.FileNotFoundException;

public class FileParser extends FileHandler {

    public FileParser() {
    }

    FileParser parsearDatos = new FileParser();

    public FileParser getParsearDatos() {
        return parsearDatos;
    }

    public void setParsearDatos(String path) throws EmptyException, FileNotFoundException {

        FileParser f1 = new FileParser();

        f1.loadFileContent(path);

    }
}
