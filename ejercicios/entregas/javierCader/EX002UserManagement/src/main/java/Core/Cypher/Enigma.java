package Core.Cypher;

import java.util.*;

public abstract class Enigma {
    private static ArrayList<Character> list = setList();
    private static ArrayList<Character> shuffledList = setShuffledList();

    private static ArrayList<Character> setList() {
        list = new ArrayList<Character>();
        shuffledList = new ArrayList<Character>();
        char character = ' ';

        //Loops over the range of ASCII values I'm using for the substitution cipher
        for (int i=32; i < 127; i++) {
            list.add(character);
            character += 1;
        }
        return list;
    }

    public static ArrayList<Character> setShuffledList() {
        shuffledList = new ArrayList<Character>(list);
        Collections.shuffle(shuffledList);
        return shuffledList;
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
}