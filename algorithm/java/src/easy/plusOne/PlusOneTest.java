package easy.plusOne;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneTest {

    @Test
    public void plusOneTo123() {
        PlusOne plusOne = new PlusOne();
        int[] input = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 2, 4};
        int[] actual = plusOne.plusOne(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void plusOneTo109() {
        PlusOne plusOne = new PlusOne();
        int[] input = new int[]{1, 0, 9};
        int[] expected = new int[]{1, 1, 0};
        int[] actual = plusOne.plusOne(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void plusOneTo999() {
        PlusOne plusOne = new PlusOne();
        int[] input = new int[]{9, 9, 9};
        int[] expected = new int[]{1, 0, 0,0};
        int[] actual = plusOne.plusOne(input);
        assertArrayEquals(expected, actual);
    }
}