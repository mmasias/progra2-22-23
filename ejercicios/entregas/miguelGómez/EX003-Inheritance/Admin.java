public class Admin extends User{
    private boolean isUserAdmin;
}
    public Admin(String name,String password,String name, boolean isUserAdmin) {
    super(username, password, name);
    this.isUserAdmin = isUserAdmin;
    }

    public Admin(boolean isUserAdmin){
    return isUserAdmin;
    }

    public boolean isUserAdmin(){
    return isUserAdmin;
    }

    public void setUserAdmin(boolean admin){
    isUserAdmin=admin;
    }
