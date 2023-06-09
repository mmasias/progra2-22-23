package classes;


public class Admin extends User {
	
    private boolean isAdmin;
    
    public Admin() {
    	isAdmin = false;
    }

    public boolean isAdmin(){

        return isAdmin;
    }
    public void setAdmin (boolean isAdmin){

        this.isAdmin = isAdmin;
    }
}
