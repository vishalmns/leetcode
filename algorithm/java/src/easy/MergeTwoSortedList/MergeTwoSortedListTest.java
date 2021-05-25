package easy.MergeTwoSortedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoSortedListTest {

    @Test
    public void mergeTwoLists() {

        ListNode l1b = new ListNode(5,null);
        ListNode l1a = new ListNode(3,l1b);
        ListNode l1 = new ListNode(1,l1a);

        ListNode l2a = new ListNode(4,null);
        ListNode l2 = new ListNode(2,l2a);

        ListNode expected = new ListNode();


        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        ListNode result = mergeTwoSortedList.mergeTwoLists(l1, l2);

    }
}