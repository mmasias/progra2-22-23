public class User {
    private String name;
    private String password;
    private Option items;

    public User(String name, String password, Option option)
    {
        this.name = name;
        this.password = password;
        this.items = option;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Option getItems() {
        return items;
    }

    public void setItems(Option items) {
        this.items = items;
    }
}
