package easy.validParantheses;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParanthesesTest {

    @Test
    public void isValidParantheses() {
        ValidParantheses validParantheses = new ValidParantheses();
        boolean result = validParantheses.isValidParantheses("()");
        assertTrue(result);

    }

    @Test
    public void notValidParantheses() {
        ValidParantheses validParantheses = new ValidParantheses();
        boolean result = validParantheses.isValidParantheses("{)");
        assertFalse(result);
    }
}