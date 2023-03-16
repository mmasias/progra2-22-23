package main;
import java.util.Scanner;

public class Utilities {
    //INPUTS
    public static String InputS(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    public static int InputInt(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    // ARRAY TOOLS
    public static User[] Expand(User[] toExpand, User toAdd) {
        int newLength = toExpand.length + 1;
        User[] expanded = new User[newLength];
        expanded = FillArray(expanded, toExpand);
        expanded[newLength - 1] = toAdd;
        return expanded;
    }
    public static User[] FillArray(User[] toFill, User[] content) {
        for (int i = 0; i < content.length; i++) {
            toFill[i] = content[i];
        }
        return toFill;
    }

    public static String[] Expand(String[] toExpand, String toAdd) {
        int newLength = toExpand.length + 1;
        String[] expanded = new String[newLength];
        expanded = FillArray(expanded, toExpand);
        expanded[newLength - 1] = toAdd;
        return expanded;
    }

    public static String[] FillArray(String[] toFill, String[] content) {
        for (int i = 0; i < content.length; i++) {
            toFill[i] = content[i];
        }
        return toFill;
    }
}