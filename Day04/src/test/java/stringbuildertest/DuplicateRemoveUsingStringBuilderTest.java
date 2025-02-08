package stringbuildertest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static stringbuilder.DuplicateRemoveUsingStringBuilder.*;

public class DuplicateRemoveUsingStringBuilderTest{
    @Test
    void duplicateRemoverTest(){
        String str = "aaaaa";
        String actualOutput = duplicateRemover(str);
        assertEquals("a",actualOutput);
    }
}
