package linearsearchtest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SearchForSpecificWordInListOfSentencesTest {

    @Test
    public void testFindSentenceWithWord_Found() {
        String[] sentences = {"The quick brown fox", "jumps over the lazy dog", "The fox is fast", "I love programming"};

        String word = "fox";
        String result = findSentenceWithWord(sentences, word);

        // Test that the first sentence containing "fox" is returned
        assertEquals("The quick brown fox", result);
    }

    @Test
    public void testFindSentenceWithWord_NotFound() {
        String[] sentences = {"The quick brown fox", "jumps over the lazy dog", "The fox is fast", "I love programming"};

        String word = "cat";
        String result = findSentenceWithWord(sentences, word);

        // Test that "Not Found" is returned when the word is not in any sentence
        assertEquals("Not Found", result);
    }

    @Test
    public void testFindSentenceWithWord_EmptyArray() {
        String[] sentences = {};

        String word = "fox";
        String result = findSentenceWithWord(sentences, word);

        // Test that "Not Found" is returned when the array is empty
        assertEquals("Not Found", result);
    }

    @Test
    public void testFindSentenceWithWord_EmptySentence() {
        String[] sentences = {"", "The quick brown fox", "jumps over the lazy dog"};

        String word = "fox";
        String result = findSentenceWithWord(sentences, word);

        // Test that the second sentence is returned, since it's the first one containing "fox"
        assertEquals("The quick brown fox", result);
    }
}
