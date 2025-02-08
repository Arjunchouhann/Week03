package stringbuffertest;

import org.junit.jupiter.api.Test;
import stringbuffer.ComparingStringBuilderAndStringBuffer;

import static org.junit.jupiter.api.Assertions.*;

public class
ComparingStringBuilderAndStringBufferTest{
    @Test
    void stringBuilderPerformance(){
        int n=1000000;
        String str = "Hello";
        long actualValue = ComparingStringBuilderAndStringBuffer.measureStringBuilderPerformance(n,str);
        assertTrue(0<actualValue,"Working Properly");
    }
    @Test
    void stringBufferPerformance(){
        int n=1000000;
        String str = "Hello";
        long actualValue = ComparingStringBuilderAndStringBuffer.measureStringBufferPerformance(n,str);
        assertTrue(0<actualValue,"Working Properly");

    }
}
