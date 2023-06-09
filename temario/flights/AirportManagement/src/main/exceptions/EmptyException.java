package main.exceptions;

public class EmptyException extends Exception {

    public EmptyException(){
        super("Sorry, the argument is empty");
    }

    public  EmptyException(String message){
        super(message);
    }
}
