public class Manager {
    int capacity;
    int size;
    User users[];

    User currentUser;

    String selectedOption;

    public Manager() {
        this.capacity = 10;
        this.size = 0;
        this.users = new User[capacity];
    }

    public Manager(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.users = new User[capacity];
    }

    public void add(User user) {
        if (size < capacity) {
            users[size] = user;
            size++;
        }
    }

    public User login(String userName, String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].login(userName, password)) {
                currentUser = users[i];
                return currentUser;
            }
        }
        System.out.println("Invalid username or password");
        return null;
    }

}