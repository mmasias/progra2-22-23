package Classes.Options;

import Utils.Interfaces.MenuItem;

public class Options implements MenuItem {
    private final String text;
    private final Runnable action;

    public Options(String text, Runnable action) {
        this.text = text;
        this.action = action;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void execute() {
        action.run();
    }

}
