package Classes;

import java.util.*;

public class Enigma {
    private static ArrayList<Character> list;
    private static ArrayList<Character> shuffledList;
    private static char character;

    public Enigma() {
        list = new ArrayList<Character>();
        shuffledList = new ArrayList<Character>();
        character = ' ';
        newKey();
    }

    private static void newKey() {
        character = ' ';
        list.clear();
        shuffledList.clear();

        //Loops over the range of ASCII values I'm using for the substitution cipher
        for (int i=32; i < 127; i++) {
            list.add(character);
            character += 1;
        }

        shuffledList = new ArrayList<Character>(list);
        Collections.shuffle(shuffledList);
    }

    public static void getKey() {
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


    public static String encrypt(String password) {
        Map<Character, Character> encryptionMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            encryptionMap.put(list.get(i), shuffledList.get(i));
        }

        char[] letters = password.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            Character encryptedChar = encryptionMap.get(letters[i]);
            if (encryptedChar != null) {
                letters[i] = encryptedChar;
            }
        }
        return new String(letters);
    }

    public static String decrypt(String password) {
        Map<Character, Character> decryptionMap = new HashMap<>();
        for (int i = 0; i < shuffledList.size(); i++) {
            decryptionMap.put(shuffledList.get(i), list.get(i));
        }

        char[] letters = password.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            Character decryptedChar = decryptionMap.get(letters[i]);
            if (decryptedChar != null) {
                letters[i] = decryptedChar;
            }
        }
        return new String(letters);
    }
}
