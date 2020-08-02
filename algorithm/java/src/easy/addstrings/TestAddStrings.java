package easy.addstrings;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestAddStrings {

    @Test
    public void testToAddTwoStrings() {
        String str1 = "100";
        String str2 = "11";
        String expected = "111";

        AddStrings addStrings = new AddStrings();
        String actual = addStrings.addStrings(str1, str2);

        assertEquals(expected, actual);
    }
}
