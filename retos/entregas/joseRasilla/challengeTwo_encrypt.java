import java.util.Scanner;

public class challengeTwo_encrypt {

    // GLOBALS
    public static char[] REAL_ALPHABET = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        SelectMode();
    }

    // Menu
    public static void WelcomeMessage() {
        System.out.println("ENCRYPTIPION PROGRAM");
    }

    public static void SelectMode() {
        PrintMenu();

        switch (InputInt()) {
            case 0:
                Mode_Encryption();
                SelectMode();
                break;
            case 1:
                Mode_Decryption();
                SelectMode();
                break;
            case 2:
                break;
            default:
                SelectMode();
                break;
        }

    }

    // CORE
    public static void Mode_Encryption() {
        PrintHeader("Encryption Mode");

        char[] messageToEncrypt = InputString("Input the message you want to encrypt").toCharArray();
        char[] encryptionKey = InputString("Input the encryption password").toCharArray();

        char[] encryptedAlphabet = CreateAlphabetWithKey(encryptionKey, REAL_ALPHABET);

        char[] translatedMessage = TranslateMessage(messageToEncrypt, REAL_ALPHABET, encryptedAlphabet);
        String translatedString = new String(translatedMessage);

        PrintHeader("The encrypted message is: " + translatedString);
    }

    public static void Mode_Decryption() {
        PrintHeader("Decryption Mode");

        char[] encryptedMessage = InputString("Input the encrypted message").toCharArray();
        char[] encryptionKey = InputString("Input the encryption password").toCharArray();

        char[] encryptedAlphabet = CreateAlphabetWithKey(encryptionKey, REAL_ALPHABET);

        char[] translatedMessage = TranslateMessage(encryptedMessage, encryptedAlphabet,REAL_ALPHABET);
        String translatedString = new String(translatedMessage);

        PrintHeader("The decrypted message is: " + translatedString);
    }

    // GENERAL METHODS

    public static char[] CreateAlphabetWithKey(char[] encryptionKey, char[] originalAlphabet) {
        char[] auxAlphabet = originalAlphabet;
        char[] newAlphabet = new char[originalAlphabet.length];

        char[] optimizedKey = Clean(encryptionKey);

        // First alphabet part filled with key
        for (int i = 0; i < optimizedKey.length; i++) {
            newAlphabet[i] = optimizedKey[i];
        }

        // Find unused alphabet letters
        auxAlphabet = Clean(auxAlphabet, optimizedKey);

        // Fill new alphabet with unused letters
        for (int i = optimizedKey.length; i < newAlphabet.length; i++) {
            newAlphabet[i] = auxAlphabet[i - optimizedKey.length];
        }

        return newAlphabet;
    }

    public static char[] TranslateMessage(char[] message, char[] currentAlphabet, char[] destinyAlphabet) {
        // Generates indexes array
        int[] indexes = GetIndexesFromAlphabet(message, currentAlphabet);
        // Creates message with indexes
        char[] translatedMessage = CreateWithIndexes(destinyAlphabet, indexes);

        return translatedMessage;
    }

    // BASIS METHODS

    public static char[] Clean(char[] toClean) {
        char[] cleanedArray = new char[0];
        for (char c : toClean) { // Iterate each char of the original array
            if (CheckIfNotExist(cleanedArray, c)) { // Check if it is more than once in the array
                cleanedArray = ExpandAndAdd(cleanedArray, c); // If not add to cleaned array
            }
        }
        return cleanedArray;
    }

    public static char[] Clean(char[] toClean, char[] toRemove) {
        char[] cleanedArray = new char[0];
        for (char c : toClean) { // Iterate each char of the original array
            if (CheckIfNotExist(toRemove, c)) { // Check if it is in the remove array
                cleanedArray = ExpandAndAdd(cleanedArray, c); // If not add to cleaned array
            }
        }
        return cleanedArray;
    }

    public static char[] ExpandAndAdd(char[] toExpand, char toAdd) {
        int newLength = toExpand.length + 1;
        char[] expanded = new char[newLength];
        expanded = FillArray(expanded, toExpand);
        expanded[newLength - 1] = toAdd;
        return expanded;
    }

    public static char[] FillArray(char[] toFill, char[] content) {
        for (int i = 0; i < content.length; i++) {
            toFill[i] = content[i];
        }
        return toFill;
    }

    public static boolean CheckIfNotExist(char[] where, char who) {
        for (int i = 0; i < where.length; i++) {
            if (where[i] == who) {
                return false;
            }
        }
        return true;
    }

    public static int[] GetIndexesFromAlphabet(char[] text, char[] alphabet) {
        int[] indexes = new int[text.length];
        // Gets indexes of the message letters
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (text[i] == alphabet[j]) {
                    indexes[i] = j;
                }
            }
        }
        return indexes;
    }

    public static char[] CreateWithIndexes(char[] destinyAlphabet, int[] indexes) {
        char[] createdMessage = new char[indexes.length];
        for (int i = 0; i < createdMessage.length; i++) {
            createdMessage[i] = destinyAlphabet[indexes[i]];
        }
        return createdMessage;
    }

    // Inputs
    public static int InputInt() {
        return scan.nextInt();
    }

    public static int InputInt(String textToShow) {
        System.out.println(textToShow);
        return scan.nextInt();
    }

    public static String InputString() {
        return scan.nextLine();
    }

    public static String InputString(String textToShow) {
        System.out.println(textToShow);
        return scan.next();
    }

    // Printers
    public static void PrintHeader(String headerText) {
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println(headerText);
        System.out.println("------------------------------------------------------------");
        System.out.println();
    }

    public static void PrintMenu() {
        // MENU MESSAGE
        System.out.println("Select the mode:");
        System.out.println("0_Encrypt");
        System.out.println("1_Decrypt");
        System.out.println("2_Close");
        System.out.println();
    }
}
