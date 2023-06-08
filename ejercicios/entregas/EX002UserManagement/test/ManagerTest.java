        public class ManagerTest {
            public static void main(String[] args) {
                // create an object of the Manager class
                Manager manager = new Manager(10, 5);

                // create some objects of the User class
                User user1 = new User("password1", "Jean");
                User user2 = new User("password2", "Marc");
                User user3 = new User("password3", "Diana");

                // add users to the Manager's list of users
                manager.addUser(user1);
                manager.addUser(user2);
                manager.addUser(user3);

                // authenticate a user
                boolean isAuthenticated = manager.authenticate("John", "password1");
                if (isAuthenticated) {
                    System.out.println("The user " + manager.getAuthenticated().getName() + " is authenticated.");
                } else {
                    System.out.println("Could not authenticate user.");
                }

                // show the Manager's list of users
                System.out.println("Users in the Manager's list:");
                for (User user : manager.getUsers()) {
                    System.out.println(user.getName());
                }

                // remove a user from the Manager's list
                manager.removeUser(user2);

                // show the updated list of users in the Manager's list
                System.out.println("Users in the Manager's list after removing one:");
                for (User user : manager.getUsers()) {
                    System.out.println(user.getName());
                }

                // add options to the Manager's Option object
                Option options = manager.options;
                options.addOption("Option One");
                options.addOption("Option TWo");
                options.addOption("Option Three");

        }
       }

