public class Manager {
    User[] listUsers;
    Option[] listOption;
    User verify;

private int maxUsers;
private int realData;

    public Manager(User[] listUsers, Option[] listOption, User verify, int maxUsers, int realData) {
        this.listUsers = listUsers;
        this.listOption = listOption;
        this.verify = verify;
        this.maxUsers = maxUsers;
        this.realData = realData;
    }

    public Manager(int maxUsers) {
        this.maxUsers = maxUsers;
        this.listOption= new  Option[maxUsers];
        this.listUsers= new  User[maxUsers];
        this.realData=0;

    }

    public void add(User u,Option o){
        this.listUsers[realData]=u;
        this.listOption[realData]=o;
        realData++;
    }

    public Option authentify(String name,String pass){

Option temp=null;
        for (int i = 0; i <realData ; i++) {
            User u=listUsers[i];
            if (u.getName().equals(name) && u.getPassword().equals(pass)) {
                temp=listOption[i];
            }
        }
        return  temp;
    }



}
