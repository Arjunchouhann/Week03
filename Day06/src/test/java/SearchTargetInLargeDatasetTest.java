import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.runtimeanalysisandbigonotation.searchthetargetinalargedataset.SearchTargetInLargeDataset.*;
public class SearchTargetInLargeDatasetTest {

    @Test
    void linearSearchTest(){
        int [] arr = {21,4,4,6,7,8,4,3,2,4,7,8,5,432,3};
        int target = 432;
        int actualValue = linearSearch(arr,target);
        assertEquals(13,actualValue);
    }

    @Test
    void binarySearchTest(){
        int [] arr = {2, 4, 7, 10, 12, 14, 17, 20, 23, 25,28, 30, 33, 36, 39, 42, 45, 48, 50, 53};
        int target = 45;
        int actualValue = binarySearch(arr,target,0,arr.length-1);
        assertEquals(16,actualValue);
    }

    @Test
    void linearSearchTest2(){
        int [] arr = {};
        int target = 4;
        int actualValue = linearSearch(arr,target);
        assertEquals(-1,actualValue);
    }

    @Test
    void binarySearchTes2(){
        int [] arr = {};
        int target = 1;
        int actualValue = binarySearch(arr,target,0,arr.length-1);
        assertEquals(-1,actualValue);
    }
}
