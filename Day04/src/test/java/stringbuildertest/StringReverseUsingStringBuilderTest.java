package stringbuildertest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static stringbuilder.StringReverseUsingStringBuilder.reverseString;

public class StringReverseUsingStringBuilderTest {
    @Test
    void reverseStringTest(){
        String str = "Hello";
        String actualOutput = reverseString(str);
        assertEquals("olleH",actualOutput);
    }
}
