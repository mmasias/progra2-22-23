package src.classes;

public enum Roles {
    ADMIN("admin"),
    AUTHOR("author"),
    SUBSCRIBER("subscriber");

    public final String role;
    private Roles(String role) {
        this.role = role;
    }
}
