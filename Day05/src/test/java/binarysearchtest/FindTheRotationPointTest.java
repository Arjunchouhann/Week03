package binarysearchtest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.binarysearch.FindTheRotationPoint.*;
public class FindTheRotationPointTest {
    @Test
    void binarySearchTest(){
        int [] arr = {7,8,9,0,1,2,3,4,5,6};
        int actualIndex = binarySearch(arr);
        assertEquals(3,actualIndex);
    }

    @Test
    void binarySearchTest2(){
        int [] arr = {};
        int actualIndex = binarySearch(arr);
        assertEquals(-1,actualIndex);
    }
}
