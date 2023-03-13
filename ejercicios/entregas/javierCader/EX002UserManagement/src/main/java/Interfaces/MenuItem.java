package Interfaces;

import Classes.Users.User;

public interface MenuItem {
    String getText();  // method to get the text to be displayed for this menu item
    void execute();    // method to execute the function associated with this menu item
}
