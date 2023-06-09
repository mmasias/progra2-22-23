package main;
public class Option {

    private String[] optionList=new String[2];

    public Option(String[] optionList) {
        this.optionList = optionList;
    }

    public void ShowOptions(){
        for(int i=0; i<optionList.length; i++){
            System.out.println(optionList[i]);
        }
    }
    public void LogOut(User user){
        user.setLogin(false);
        System.out.println("Good bye");
    }
    public void ShowUser(User[] userList){
        for(int i=0;i<userList.length;i++){
           if(userList[i]!=null){
               System.out.println(userList[i].getUserName());
           }
        }
    }



}
