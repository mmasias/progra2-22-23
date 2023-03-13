package Classes.Menu;

import Interfaces.MenuItem;

public class MenuItemImpl implements MenuItem {
    private final String text;
    private final Runnable action;

    public MenuItemImpl(String text, Runnable action) {
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
