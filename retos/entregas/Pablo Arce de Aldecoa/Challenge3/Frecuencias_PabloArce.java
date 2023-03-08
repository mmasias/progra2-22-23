import java.util.*;

public class Frecuencias_PabloArce{
    public static void main(String args[]) {

        char filler = 0;
        List<Character> letters = new ArrayList<Character>(); letters.add(filler); // i add an element on each list so i can run a for afterwards
        List<Integer> frequency = new ArrayList<Integer>(); frequency.add(0);

        // This could also be done with regular arrays, but to keep the code more efficient and clearer i will use lists like in python
        
        System.out.println("Introduce una frase: \n");
        Scanner entry = new Scanner(System.in);
        String str = entry.nextLine();
        System.out.println("");

        // We introduce every char into the array, unless its a space, which is char N.32

        for (int i=0; i<str.length(); i++){
            char chr = str.charAt(i);
            if (chr != 32){
                for (int j = 0; j<letters.size(); j++){
                    if (chr == letters.get(j)){
                        frequency.set(j, frequency.get(j) + 1);
                        break;
                    }
                    else if(j+1 == letters.size()){
                        letters.add(chr);
                        frequency.add(0);
                    }
                }
            }
        }

        // Search for the biggest number

        int biggestNum = 0;
        for (int i = 1; i<frequency.size(); i++){
            if (frequency.get(i) > biggestNum){
                biggestNum = frequency.get(i);
            }
        }

        // Putting the biggest number on top of a new list, until the biggest number is 0.
        
        List<Character> orderedLetters = new ArrayList<Character>(); 
        List<Integer> orderedFrequency = new ArrayList<Integer>();
        
        while (biggestNum > 0){
            for (int i = 1; i<frequency.size(); i++){
                if (frequency.get(i) == biggestNum){
                    orderedLetters.add(letters.get(i));
                    orderedFrequency.add(frequency.get(i));
                }
            }
            biggestNum--;
        }
        

        // Displaying:
        
        System.out.println("La frase era: '"+str+"'\n");
        for (int i = 0; i<orderedLetters.size(); i++){
            System.out.print(orderedLetters.get(i)+ " ".repeat(5));
            System.out.println(orderedFrequency.get(i));
        }
        System.out.println("");

        entry.close();
    }
 
}