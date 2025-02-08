package binarysearchtest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.binarysearch.FindTheFirstAndLastOccurrenceOfElement.*;

public class FIndTheFirstAndLastOccurrenceOfElementTest {
    @Test
    void findFirstTest(){
        int [] arr = {1, 3, 5, 5, 7, 8, 9, 9};
        int target = 9;
        int actualIndex = findFirst(arr,target);
        assertEquals(6,actualIndex);
    }

    @Test
    void findFirstTest2(){
        int [] arr = {0};
        int target = 4;
        int actualIndex = findFirst(arr,target);
        assertEquals(-1,actualIndex);
    }

    @Test
    void findLastTest(){
        int [] arr = {1, 3, 5, 5, 7, 8, 9, 9};
        int target = 9;
        int actualIndex = findLast(arr,target);
        assertEquals(7,actualIndex);
    }

    @Test
    void findLastTest2(){
        int [] arr = {0};
        int target = 4;
        int actualIndex = findLast(arr,target);
        assertEquals(-1,actualIndex);
    }
}
