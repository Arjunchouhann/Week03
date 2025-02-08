package stringbuffertest;

import org.junit.jupiter.api.Test;
import stringbuffer.ConcatenateStringsEffectivelyUsingStringBuffer;

import static org.junit.jupiter.api.Assertions.*;

public class ConcatenateStringsEffectivelyUsingStringBufferTest {

    @Test
    void concatenatedStringTest(){
        String [] string = {"Hello","World"};
        String actualString = ConcatenateStringsEffectivelyUsingStringBuffer.concatenatedString(string);
        assertEquals("Hello World ",actualString);
    }
}
