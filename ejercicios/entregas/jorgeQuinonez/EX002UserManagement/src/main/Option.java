package src.main;

public class Option {
    private String[] options;

    public Option() {
        this.options = new String[5];
        this.options[0] = "1. Show profile";
        this.options[1] = "2. Edit profile";
        this.options[2] = "3. Change password";
        this.options[3] = "4. Change username";
        this.options[4] = "5. Logout";
    }

    public String[] getOptions() {
        return this.options;
    }
}
