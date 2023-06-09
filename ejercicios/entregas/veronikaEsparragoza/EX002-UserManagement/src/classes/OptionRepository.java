package src.classes;

public class OptionRepository {
    private static Option[] MENU_DATA = {
            new Option("Create a new user", Roles.ADMIN),
            new Option("Delete a user", Roles.AUTHOR),
            new Option("Update a user", Roles.SUBSCRIBER),
            new Option("List all users", Roles.ADMIN),
            new Option("Exit", Roles.SUBSCRIBER),
    };
    public static Option[] getOptionsArray() { return MENU_DATA; }
}
