package binarysearchtest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.binarysearch.FindThePeakElement.*;
public class FindThePeakElementTest {
    @Test
    void binarySearchTest(){
        int [] arr = {45,32,645,45,63,66,67,32,75};
        int actualIndex = binarySearch(arr);
        assertEquals(6,actualIndex);
    }

    @Test
    void binarySearchTest2(){
        int [] arr ={};
        int actualIndex = binarySearch(arr);
        assertEquals(-1,actualIndex);
    }
}
