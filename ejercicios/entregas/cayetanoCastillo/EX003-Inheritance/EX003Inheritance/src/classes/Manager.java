package classes;

public class Manager {
    private int capacity;
    private int size;
    private User users[];
    private User authenticatedUser;
    private MenuOption selectedOption;
    private int maxUsers;

    private User currentUser;

    

    public Manager() {
        this.capacity = 10;
        this.size = 0;
        this.users = new User[capacity];
        this.selectedOption = null;
        this.authenticatedUser = null;
        this.maxUsers = capacity;
    }

    public Manager(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.users = new User[capacity];
        this.maxUsers = capacity;
        this.selectedOption = null;
        this.authenticatedUser = null;
    }

    public void addUser(User user) {
        if (size < capacity) {
            users[size] = user;
            size++;
        }
    }
    public boolean authenticatedUser(String username, String password) {
    	boolean aUser = false;
    	int index = 0;
    	boolean found = false;
    	
    	while((index < capacity) && (found == false)) {
    		if(users[index].getUserName().equals(username)) {
    			if(users[index].getPassword().equals(password)) {
    				aUser = true;
    				found = true;
    			}else {
    				aUser = false;
    				found = true;
    			}
    		}else {
    			index++;	
    		}
    		
    	}
    	return aUser;
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
    public void showMenu(int index) {
    	System.out.println("Description: " + selectedOption.getDescription());
    	System.out.println("Options: ");
    	for(int i =0; i < selectedOption.getItems().length ; i++) {
    		System.out.println("Items: "+ selectedOption.getItems()[i]);
    	}
    	
    }

}