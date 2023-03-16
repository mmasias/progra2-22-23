package main;
public class Option {

    private boolean isLogged = true;

    public boolean getIsLogged() {
        return isLogged;
    }

    public void setIsLogged(boolean isLogged) {
        this.isLogged = isLogged;
    }

    public Option() {
        isLogged = true;
    }

    public void echoMessage(String message) {
        System.out.println(message);
    }

}