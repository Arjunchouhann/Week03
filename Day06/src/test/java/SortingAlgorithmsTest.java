import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.runtimeanalysisandbigonotation.sortinglargedataefficiently.SortingAlgorithms.*;

public class SortingAlgorithmsTest {
    @Test
    void bubbleSortTest(){
        int [] arr = {2,5,6,4,7,3,2,4};
        int [] arr1 = arr;
        bubbleSort(arr1);
        assertArrayEquals(arr,arr1);
    }

    @Test
    void mergeSortTest(){
        int [] arr = {2,5,6,4,7,3,2,4};
        int [] arr1 = arr;
        mergeSort(arr1,0,arr1.length-1);
        assertArrayEquals(arr,arr1);
    }

    @Test
    void quickSortTest(){
        int [] arr = {2,5,6,4,7,3,2,4};
        int [] arr1 = arr;
        quickSort(arr1,0,arr1.length-1);
        assertArrayEquals(arr,arr1);
    }
}
