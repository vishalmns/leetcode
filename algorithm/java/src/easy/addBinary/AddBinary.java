package easy.addBinary;

//https://leetcode.com/problems/add-binary/

//1 + 1 = 10
//11 + 1 = 100

import java.util.ArrayList;
import java.util.List;

public class AddBinary {
    public String addBinary(String a, String b) {

        String small;
        String large;
        int smallIndex;
        int largeIndex;

        if (a.length() > b.length()) {
            small = b;
            large = a;
            smallIndex = b.length() -1;
            largeIndex = a.length() -1;
        }
        else {
            small = a;
            large = b;
            smallIndex = a.length() - 1;
            largeIndex = b.length() - 1;
        }

        int carry = 0;
        StringBuilder st = new StringBuilder();
        for (int i = smallIndex; i >=0 ; i--) {
            char sc = small.charAt(i);
            char lc = large.charAt(largeIndex + i - smallIndex);

            int temp = 0;
            int num1 = Character.getNumericValue(sc);
            int num2 = Character.getNumericValue(lc);

            temp = num1 + num2 + carry;
            st.append(temp % 2);
            carry = temp / 2;
        }

        for (int i = largeIndex - smallIndex -1; i >=0 ; i--) {
            char lc = large.charAt(i);

            int temp = 0;
            int num1 = Character.getNumericValue(lc);
            temp = num1 + carry;
            st.append(temp % 2);
            carry = temp /2;
        }
        if (carry != 0) {
            st.append(carry);
        }
        return st.reverse().toString();
    }

    public String betterSolution(String a, String b) {
        StringBuilder sb = new StringBuilder();
        var ai = a.length() - 1;
        var bi = b.length() - 1;
        var rem = 0;

        while (ai >= 0 || bi >= 0) {
            var sum = rem;
            if (ai >= 0) {
                sum += a.charAt(ai--) - '0';
            }
            if (bi >= 0) {
                sum += b.charAt(bi--) - '0';
            }
            sb.append(sum % 2);
            rem = sum > 1 ? 1 : 0;
        }

        if (rem > 0) {
            sb.append(rem);
        }

        return sb.reverse().toString();
    }}
