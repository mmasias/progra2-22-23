import java.util.Scanner;
public class Option {
    private String[] options;
    private Scanner scanner;
    public Option(String[] options) {
        this.options = options;
        this.scanner = new Scanner(System.in);    }
    public void display() {
        System.out.println("Choose:");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);        }    }
    public int read() {
        int userOption = scanner.nextInt();
        if (userOption <= 0 || userOption > options.length + 1) {
            System.out.println("Wrong");
            return (0);
        } else
            return userOption;   }
    public void closeScanner() {
        scanner.close();   }}