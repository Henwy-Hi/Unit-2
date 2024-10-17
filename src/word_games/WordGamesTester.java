package word_games;
import java.util.Scanner;

public class WordGamesTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for a word
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        // Scramble it
        // Print out scrambled word
        WordGames wordGames = new WordGames(word);
        word = wordGames.scramble(word);
        System.out.println(word);
        // Ask for an index
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        // Ask for random word
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String nextWord = input.nextLine();
        // Add random word at index
        nextWord = wordGames.bananaSplit(idx, nextWord);
        System.out.println(nextWord);
        // Print out the word


        // Ask for a character (store as a String)
        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);
        input.nextLine();
        // Ask for random word
        System.out.println("Enter yet another random word: ");
        String finalWord = input.nextLine();
        // Add random word at character
        finalWord = wordGames.bananaSplit(ch, finalWord);
        // Print out the word
        System.out.println(finalWord);
    }
}
