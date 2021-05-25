package easy.lengthOfLastWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordTest {

    @Test
    public void lengthOfLastWordInHelloWorld() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        int actual = lengthOfLastWord.lengthOfLastWord("Hello World");
        assertEquals(5,actual);
    }

    @Test
    public void lengthOfEmptytWord() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        int actual = lengthOfLastWord.lengthOfLastWord("");
        assertEquals(0,actual);
    }

    @Test
    public void lengthOfBlankWord() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        int actual = lengthOfLastWord.lengthOfLastWord("   ");
        assertEquals(0,actual);
    }
}