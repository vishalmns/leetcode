package easy.detectcapital;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestDectectCaptial {

    @Test
    public void allCapitalIsAValidWord() {
        DectectCapital dectectCapital = new DectectCapital();
        assertTrue(dectectCapital.detectCapitalUse("USA"));
    }

    @Test
    public void allLowerCaseIsAValidWord() {
        DectectCapital dectectCapital = new DectectCapital();
        assertTrue(dectectCapital.detectCapitalUse("leetcode"));
    }

    @Test
    public void allRegularIsAValidWord() {
        DectectCapital dectectCapital = new DectectCapital();
        assertTrue(dectectCapital.detectCapitalUse("Google"));
    }

    @Test
    public void allNonRegularIsAInValidWord() {
        DectectCapital dectectCapital = new DectectCapital();
        assertFalse(dectectCapital.detectCapitalUse("sAS"));
    }


}
