package binarysearchtest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.binarysearch.SearchForATargetValue.*;
public class SearchForATargetValueTest {
    @Test
    void binarySearchTest(){
        int [][] arr = { {2,4,5},{12,5,8},{5,4,3}};
        int target = 5;
        boolean actualValue = binarySearch(arr,target);
        assertTrue(actualValue);
    }

    @Test
    void binarySearchTest2(){
        int [][] arr = {};
        int target = 5;
        boolean actualValue = binarySearch(arr,target);
        assertFalse(actualValue);
    }
}
