package main.exceptions;

public class FileNotFoundException extends Exception{
    public FileNotFoundException() {
        super("File was not found in the path you provided");
    }

    public FileNotFoundException(String message) {
        super(message);
    }
}
