import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class EncryptionProgram {

    private Scanner scanner;
    private Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char character;
    private String line;
    private char[] letters;

    EncryptionProgram() {
        scanner = new Scanner(System.in);
        random = new Random();
        list = new ArrayList<Character>();
        shuffledList = new ArrayList<Character>();
        character = ' ';

        newKey();
        askQuestion();
    }

    private void askQuestion() {
        while(true) {
            System.out.println("*".repeat(20));
            System.out.println("What do you want to do?");
            System.out.println("N: New Key, G: Get Key, E: Encrypt, D: Decrypt: Q: Quit");
            char response = Character.toUpperCase(scanner.nextLine().charAt(0));

            switch (response) {
                case 'N':
                    newKey();
                    break;
                case 'G':
                    getKey();
                    break;
                case 'E':
                    encrypt();
                    break;
                case 'D':
                    decrypt();
                    break;
                case 'Q':
                    quit();
                    break;
                default:
                    System.out.println("Not a valid answer");
            }
        }
    }

    private void newKey() {
        character = ' ';
        list.clear();
        shuffledList.clear();

        //Loops over the range of ASCII values I'm using for the substitution cipher
        for (int i=32; i < 127; i++) {
            list.add(Character.valueOf(character));
            character += 1;
        }

        shuffledList = new ArrayList<Character>(list);
        Collections.shuffle(shuffledList);
        System.out.println("A new key has been generated");
    }

    private void getKey() {
        System.out.println("Key: ");
        for (Character x: list) {
            System.out.print(x);
        }
        System.out.println();
        for (Character x: shuffledList) {
            System.out.print(x);
        }
        System.out.println();
    }

    private String getMessage(String operationType) {
        System.out.printf("Enter a message to %s: ", operationType);
        String message = scanner.nextLine();
        return message;
    }

    private void encrypt() {
        letters = getMessage("encrypt").toCharArray();

        for (int i=0; i<letters.length; i++) {
            for (int j=0; j<list.size(); j++) {
                if (letters[i] == list.get(j)) {
                    letters[i] = shuffledList.get(j);
                    break;
                }
            }
        }

        System.out.println("Encrypted message: ");
        for (char x: letters) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void decrypt() {
        letters = getMessage("decrypt").toCharArray();

        for (int i=0; i<letters.length; i++) {
            for (int j=0; j<shuffledList.size(); j++) {
                if (letters[i] == shuffledList.get(j)) {
                    letters[i] = list.get(j);
                    break;
                }
            }
        }

        System.out.println("Decrypted message: ");
        for (char x: letters) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void quit() {
        System.out.println("Thank you, have a nice day!");
        System.exit(0);
    }
}
