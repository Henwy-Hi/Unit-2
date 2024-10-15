package word_games;

/**
 * Name: Henry Felsted
 * Date: 10-15-24
 * Description: This is a collection of methods for a word game that
 * people can play
 */
public class WordGames
{
    private String word;

    public WordGames(String text)
    {
        word = text;
    }

    /**
     * Scrambles a word by switching the first and second half of the word.
     * @return the scrambled word
     */
    public String scramble(String word)
    {
        // switch first half
        String firstHalf = (word.substring(0, (word.length()/2)));
        // and second half
        String secondHalf = (word.substring((word.length()/2), word.length()));
        return secondHalf + firstHalf;

    }

    /**
     * Modifies a given string by inserting text at the specified index
     * @param insertIdx int index where the text will be inserted
     * @param insertText String text to be inserted
     * @return modified text
     */
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
        return "";

    }

    /**
     * Modifies a given string by inserting text at the first occurrence of the
     * specified character
     * @param insertChar char character you want
     * @param insertText String
     * @return the modified text
     */
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        return "";

    }

    @Override
    public String toString()
    {
        // Games[word]
        return "";

    }

}
