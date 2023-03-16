import java.util.Scanner;

/**
 * The Option class provides a way to display a list of options to the user
 * and read their input. It also has a method to close the scanner used to read
 * user input.
 */
public class Option {
    private String[] options;
    private Scanner scanner;

    /**
     * Creates a new Option instance with the given options.
     * 
     * @param options An array of strings representing the available options.
     */
    public Option(String[] options) {
        this.options = options;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Displays the list of options to the user.
     */
    public void display() {
        System.out.println("Please select an option:");

        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    /**
     * Reads the user's input and returns it as an integer representing the option
     * selected by the user. If the user enters an invalid input, an error message
     * is displayed and 0 is returned.
     * 
     * @return An integer representing the option selected by the user.
     */
    public int read() {
        int userOption = scanner.nextInt();

        if (userOption <= 0 || userOption > options.length + 1) {
            System.out.println("ERROR! - Please select an option from the list.");
            return (0);
        } else
            return userOption;
    }

    /**
     * Closes the scanner used to read user input.
     */
    public void closeScanner() {
        scanner.close();
    }
}
