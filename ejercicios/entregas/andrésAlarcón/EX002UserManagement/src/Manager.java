public class Manager {

   private User[] usersList;
   private Option[] optionsList;
   private int maxUsers = 20;


   public Manager() {
       this.usersList = new User[maxUsers];
       this.optionsList = new Option[maxUsers];
   }


}
