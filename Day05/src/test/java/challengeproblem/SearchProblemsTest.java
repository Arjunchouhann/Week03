package challengeproblem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchProblemsTest {
    @Test
    void linearSearchMissingPositiveTest(){
        int []arr = {3, 4, -1, 1};
        int actualValue = linearSearchMissingPositive(arr);
        assertEquals(2,actualValue);
    }
    @Test
    void binarySearchTest(){
        int []arr = {3, 4, -1, 1};
        int target = 4;
        int actualValue = binarySearch(arr,target);
        assertEquals(1,actualValue);
    }
}
