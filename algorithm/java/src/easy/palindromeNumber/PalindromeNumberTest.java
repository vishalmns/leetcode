package easy.palindromeNumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {

    @Test
    public void is1APalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean result = palindromeNumber.isPalindrome(1);

        assertTrue(result);
    }

    @Test
    public void is11APalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean result = palindromeNumber.isPalindrome(11);

        assertTrue(result);
    }

    @Test
    public void is101APalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean result = palindromeNumber.isPalindrome(101);

        assertTrue(result);
    }

    @Test
    public void is1010APalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean result = palindromeNumber.isPalindrome(1010);

        assertFalse(result);
    }
}