package easy.implementStrStr;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementStrStrTest {

    @Test
    public void implementStrStrIsPresentAtIndex2() {
        ImplementStrStr implementStrStr = new ImplementStrStr();
        int actual = implementStrStr.implementStrStr("abcd", "cd");
        assertEquals(2,actual);
    }
}