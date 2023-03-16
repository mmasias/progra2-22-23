package main;
public class Manager {
    private boolean isLogged = false;

    public Manager() {
        isLogged = false;
    }
    public void setIsLogged(boolean isLogged) {
        this.isLogged = isLogged;
    }
    public boolean getIsLogged() {
        return isLogged;
    }
}