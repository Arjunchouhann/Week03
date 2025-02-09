import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.runtimeanalysisandbigonotation.stringconcatenationperformance.StringConcatenationPerformance.*;

public class StringConcatenationPerformanceTest {

    @Test
    public void testStringConcatenation() {
        int count = 1000; // Set a count for the test
        long timeTaken = stringConcatenation(count);
        System.out.println("String concatenation time for count " + count + ": " + timeTaken + " ms");

        assertTrue(timeTaken < 100, "String concatenation took too long!");
    }

    @Test
    public void testStringBuilderConcatenation() {
        int count = 1000; // Set a count for the test
        long timeTaken = stringBuilderConcatenation(count);
        System.out.println("StringBuilder concatenation time for count " + count + ": " + timeTaken + " ms");

        assertTrue(timeTaken < 50, "StringBuilder concatenation took too long!");
    }

    @Test
    public void testStringBufferConcatenation() {
        int count = 1000; // Set a count for the test
        long timeTaken = stringBufferConcatenation(count);
        System.out.println("StringBuffer concatenation time for count " + count + ": " + timeTaken + " ms");

        assertTrue(timeTaken < 50, "StringBuffer concatenation took too long!");
    }

    @Test
    public void testLargeInput() {
        int count = 10000; // Larger count for performance comparison
        long stringConcatTime = stringConcatenation(count);
        long stringBuilderTime = stringBuilderConcatenation(count);
        long stringBufferTime = stringBufferConcatenation(count);

        System.out.println("String concatenation time for count " + count + ": " + stringConcatTime + " ms");
        System.out.println("StringBuilder concatenation time for count " + count + ": " + stringBuilderTime + " ms");
        System.out.println("StringBuffer concatenation time for count " + count + ": " + stringBufferTime + " ms");

        assertTrue(stringBuilderTime < stringConcatTime, "StringBuilder is slower than String concatenation!");
        assertTrue(stringBufferTime < stringConcatTime, "StringBuffer is slower than String concatenation!");
    }
}
