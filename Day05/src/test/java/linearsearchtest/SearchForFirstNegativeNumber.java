package linearsearchtest;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SearchForFirstNegativeNumber {
    @Test
    void linearSearchingForNegativeTest(){
        int [] arr = {10,5,8,-1,-2,6,-8};
        int actualValue = linearSearchingForNegative(arr);
        assertEquals(3,actualValue);
    }

    @Test
    void linearSearchingForNegativeTest2(){
        int [] arr = {0};
        int actualValue = linearSearchingForNegative(arr);
        assertEquals(-1,actualValue);
    }
}

