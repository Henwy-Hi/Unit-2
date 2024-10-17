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
        int halfLength = (word.length() / 2);
        // switch first half
        String firstHalf = (word.substring(0, halfLength));
        // and second half
        String secondHalf = (word.substring(halfLength, word.length()));
        return (secondHalf + firstHalf);
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
        String firstHalf = word.substring(0, insertIdx);
        String secondHalf = word.substring(insertIdx, word.length());
        // insertIdx
        return (firstHalf + insertText + secondHalf);

    }

    /**
     * Modifies a given string by inserting text at the first occurrence of the
     * specified character
     * @param insertChar char character you want
     * @param insertText String
     * @return the modified text
     */
    public String bananaSplit(char insertChar, String insertText)
    {
        int index = word.indexOf(insertChar);
        // Insert insertText after the first
        String firstHalf = word.substring(0, index + 1);
        String secondHalf = word.substring(index + 1);
        // occurence of the insertChar
        return firstHalf + insertText + secondHalf;

    }

    @Override
    public String toString()
    {
        // Games[word]
        return "";

    }

}
