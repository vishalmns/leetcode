package easy.plusOne;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        List<Integer> li = new ArrayList<>();
        int carry = 1;

        for (int i = digits.length-1; i >=0 ; i--) {
            int temp = digits[i] +  carry;
            carry = temp / 10;
            li.add(temp % 10);
        }
        if (carry != 0) {
            li.add(carry);
        }

        int[] ans = new int[li.size()];
        int index = li.size() - 1;

        for (Integer i : li) {
            ans[index--] = i;
        }
        return ans;
    }
}
