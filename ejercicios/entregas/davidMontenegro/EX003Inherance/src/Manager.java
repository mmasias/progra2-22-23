package src;
public class Manager{
    int capacity;
    int size;
    User[] users;
    public Manager(){
        this.capacity = 15;
        this.size = 0;
        this.users = new User[capacity];
    }
    public Manager(int capacity){
        this.capacity = capacity;
        this.size = size;
        this.users = new users[capacity];
    }
    public int getSize(){
        return size;
    }
    public void add(User user){
        if(size < capacity){
            users[size] = user;
            size++;
        }
    }
    publuc User login(String userName, String password){
        for(int i = 0; i < size; i++){
            if(users[i].login(userName, password)){
                return users[i];
            }
        }
        System.out.println("Incorrect username or password");
        return null;
    }
}