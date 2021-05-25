package easy.addBinary;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinaryTest {

    @Test
    public void addBinary0and1() {
        AddBinary addBinary = new AddBinary();
        String actual = addBinary.addBinary("0", "1");

        assertEquals("1", actual);
    }

    @Test
    public void addBinary10and1() {
        AddBinary addBinary = new AddBinary();
        String actual = addBinary.addBinary("10", "1");

        assertEquals("11", actual);
    }

    @Test
    public void addBinary11and11() {
        AddBinary addBinary = new AddBinary();
        String actual = addBinary.addBinary("11", "11");

        assertEquals("110", actual);
    }

    @Test
    public void addBinary1010and1011() {
        AddBinary addBinary = new AddBinary();
        String actual = addBinary.addBinary("1010", "1011");

        assertEquals("10101", actual);
    }
}