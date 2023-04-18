package clases;
import java.util.ArrayList;

public class Manager {

    private ArrayList<User> allUsers;
    private boolean authentification;
    private Option optionSeleted;
    private int maxUsers;

    private int size;




    public Manager(int maxUsuarios) {
            this.allUsers = new ArrayList<User>();
            this.authentification = false;
            this.optionSeleted = null;
            this.maxUsers = maxUsuarios;
            this.size=0;
        }

        public void addUsuario(User usuario) {
            if (allUsers.size() < maxUsers) {
                allUsers.add(usuario);
                this.size++;

            } else {
                System.out.println("Error: número máximo de usuarios alcanzado");
            }
        }

        public boolean autentificarUsuario(String login, String password) {
            for (User usuario : allUsers) {
                if (usuario.getLogin().equals(login) && usuario.getPassword().equals(password)) {

                    this.authentification=true;
                    return true;
                }
            }
            return false;
        }

        public int getSize() {
         return size;
    }
}

