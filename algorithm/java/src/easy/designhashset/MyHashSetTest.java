package easy.designhashset;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashSetTest {

    @Test
    public void TestMyHashSet() {
        MyHashSet myHashSet = new MyHashSet();

        myHashSet.add(1);
        assertTrue(myHashSet.contains(1));

        myHashSet.add(2);
        myHashSet.remove(1);

        assertFalse(myHashSet.contains(1));

        myHashSet.remove(4);

        assertFalse(myHashSet.contains(4));
    }
}