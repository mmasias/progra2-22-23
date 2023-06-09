package Main;

public class MenuOptions extends Options {
    String description;

    public MenuOptions(String description){
        this.description=description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }

}
