import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.runtimeanalysisandbigonotation.recursivevsiterativefibonaccicomputation.RecursiveVsIterativeFibonacci.*;

public class RecursiveVsIterativeFibonacciTest {

    @Test
    public void testRecursiveFibonacci() {
        assertEquals(0, recursiveFibonacci(0));
        assertEquals(1, recursiveFibonacci(1));
        assertEquals(8, recursiveFibonacci(6));
        assertEquals(55,recursiveFibonacci(10));
    }

    @Test
    public void testIterativeFibonacci() {
        assertEquals(0, iterativeFibonacci(0));
        assertEquals(1, iterativeFibonacci(1));
        assertEquals(8, iterativeFibonacci(6));
        assertEquals(55, iterativeFibonacci(10));
    }

    @Test
    public void testComparison() {
        assertEquals(recursiveFibonacci(30), iterativeFibonacci(30));
    }
}
