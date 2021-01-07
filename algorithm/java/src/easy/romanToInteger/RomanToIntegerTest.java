package easy.romanToInteger;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntegerTest {

    @Test
    public void Return1forRomanValueI() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int returnValue = romanToInteger.romanToInteger("I");

        assertEquals(1, returnValue);
    }

    @Test
    public void Return4forRomanValueIV() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int returnValue = romanToInteger.romanToInteger("IV");

        assertEquals(4, returnValue);
    }

    @Test
    public void Return58forRomanValueLVIII() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int returnValue = romanToInteger.romanToInteger("LVIII");

        assertEquals(58, returnValue);
    }

    @Test
    public void Return1994forRomanValueMCMXCIV() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int returnValue = romanToInteger.romanToInteger("MCMXCIV");

        assertEquals(1994, returnValue);
    }

}