package exercises;

import java.util.ArrayList;

public class FiveLetters {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList();

        words.add("yellow");
        words.add("blue");
        words.add("green");
        words.add("brown");
        words.add("purple");

        getFive(words);
    }

    public static void getFive(ArrayList<String> words) {
        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
