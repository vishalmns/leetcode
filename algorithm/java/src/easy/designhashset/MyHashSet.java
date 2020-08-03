package easy.designhashset;

import java.util.ArrayList;

public class MyHashSet {
    /** Initialize your data structure here. */

    ArrayList<Integer> arrayList;

    public MyHashSet() {
        arrayList = new ArrayList<>();
    }

    public void add(int key) {
        if (!contains(key)) {
            arrayList.add(key);
        }

    }

    public void remove(int key) {
        if (contains(key)) {
            arrayList.remove(new Integer(key));
        }

    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
      return arrayList.contains(key);
    }
}
