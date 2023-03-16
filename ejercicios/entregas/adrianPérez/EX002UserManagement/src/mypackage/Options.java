package mypackage;

public class Options {

    private boolean isLogged = true;

    public boolean getIsLogged() {
        return isLogged;
    }

    public void setIsLogged(boolean isLogged) {
        this.isLogged = isLogged;
    }

    public Options() {
        isLogged = true;
    }

    public void echoMessage(String message) {
        System.out.println(message);
    }
    
    
}
