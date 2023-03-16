package src.classes;
import java.util.Scanner;
public class Option {
    private String optionDescription;
    private Roles role;
    private static int index;
    private static int Index = Manager.getIndex(index);

    public Option(String optionDescription, Roles role) {
        this.optionDescription = optionDescription;
        this.role = role;
    }

    public String getOptionDescription() {
        return optionDescription;
    }

    public static void showOptions(Roles role){
        Scanner inputOptionSelect = new Scanner(System.in);
        switch (role){
            case ADMIN:
                {
                    for (int i = 1; i < OptionRepository.getOptionsArray().length; i++){
                    System.out.println(
                            i +
                            " - " +
                            OptionRepository.getOptionsArray()[i-1].getOptionDescription());
                }};
                optionMenu(Integer.parseInt(inputOptionSelect.nextLine()));
                break;
            case AUTHOR:
                {
                    Option[] visibleOptions = new Option[0];

                    for (int i = 0; i < OptionRepository.getOptionsArray().length; i++){
                        if (OptionRepository.getOptionsArray()[i].role == Roles.AUTHOR ||
                                OptionRepository.getOptionsArray()[i].role == Roles.SUBSCRIBER){
                            Option[] tmp = new Option[visibleOptions.length + 1];
                            for (int j = 0; j < visibleOptions.length; j++){
                                tmp[j] = visibleOptions[j];
                            }
                            tmp[tmp.length - 1] = OptionRepository.getOptionsArray()[i];
                            visibleOptions = tmp;
                        }
                    }
                    for (int i = 0; i < visibleOptions.length; i++){
                        System.out.println((i+1) + " - " + visibleOptions[i].getOptionDescription());
                    }
                };
            optionMenu(Integer.parseInt(inputOptionSelect.nextLine()));
            break;
            case SUBSCRIBER:
            {
                Option[] visibleOptions = new Option[0];

                for (int i = 0; i < OptionRepository.getOptionsArray().length; i++){
                    if (OptionRepository.getOptionsArray()[i].role == Roles.SUBSCRIBER){
                        Option[] tmp = new Option[visibleOptions.length + 1];
                        for (int j = 0; j < visibleOptions.length; j++){
                            tmp[j] = visibleOptions[j];
                        }
                        tmp[tmp.length - 1] = OptionRepository.getOptionsArray()[i];
                        visibleOptions = tmp;
                    }
                }
                for (int i = 0; i < visibleOptions.length; i++){
                    System.out.println((i+1) + " - " + visibleOptions[i].getOptionDescription());
                }
            };
            optionMenu(Integer.parseInt(inputOptionSelect.nextLine()));
            break;
            default:
                System.out.println("Sorry, you are a guest");
                break;
        }
    }

    public static void optionMenu(int inputOptionSelect){
        //Scanner inputOptionSelectInside = new Scanner(System.in);
        switch (inputOptionSelect){
            case 1:
                System.out.println("Create a new user");
                System.out.println("Enter username:");
                Scanner inputUserName = new Scanner(System.in);
                String userName = inputUserName.nextLine();

                System.out.println("Enter password:");
                Scanner inputPassword = new Scanner(System.in);
                String userPassword = inputPassword.nextLine();

                User peopleAdd = new User(userName, userPassword, Roles.AUTHOR);
                UserRepository.add(peopleAdd);
                System.out.println("User created: "+peopleAdd.getUserName()+" - "+peopleAdd.getUserPassword()+" - "+peopleAdd.getUserRole());
                break;
            case 2:
                System.out.println("Delete a user");
                System.out.println("Enter the index of the user you want to delete:");
                Scanner inputIndex = new Scanner(System.in);
                UserRepository.delete(Integer.parseInt(String.valueOf(inputIndex)));
                System.out.println("User deleted " + UserRepository.get()[Index].getUserName());
                break;
            case 3:
                System.out.println("Update a user");
                break;
            case 4:
                System.out.println("List all users");
                for (int i = 0; i < UserRepository.get().length; i++){
                    System.out.println(UserRepository.get()[i].getUserName());
                }
                break;
                case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
