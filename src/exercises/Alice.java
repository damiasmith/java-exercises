package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
      String aliceText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
      String word;
      Scanner in = new Scanner(System.in);

      System.out.println("Enter word: ");
      word = in.next();

      Boolean found = aliceText.toLowerCase().contains(word);

      System.out.println("Found: " + found);

    }
}
