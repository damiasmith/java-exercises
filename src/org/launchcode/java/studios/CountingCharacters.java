package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String paragraph;

        System.out.println("Enter text:");
        paragraph = in.nextLine();

        countCharacters(paragraph);
    }

    public static void countCharacters(String paragraph) {
        char[] charactersInParagraph = paragraph.toCharArray();
        HashMap<Character, Integer> countCharacters = new HashMap<>();

        for (int i = 0; i < charactersInParagraph.length; i++) {
            Character character = Character.toLowerCase(charactersInParagraph[i]);
            Integer count = 0;
            if (countCharacters.containsKey(character)) {
                    Integer addCount = countCharacters.get(character);
                    addCount +=1;
                    countCharacters.replace(character, addCount);
            } else if (Character.isAlphabetic(character)) {
                count += 1;
                countCharacters.put(character, count);
            }
        }
        for (Map.Entry<Character, Integer> countCharacter : countCharacters.entrySet()) {
            System.out.println(countCharacter.getKey()  + " : " + countCharacter.getValue());
        }
    }
}
