package easy.longestCommonPrefix;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        char[] charsOfFirstString = strs[1].toCharArray();

        int maxNumber = 200;
        String leastStringLenght = "";

        // finding the string which has least lenght
        for (String str:strs) {
            if (str.length() < maxNumber) {
                leastStringLenght = str;
                maxNumber = str.length();
            }
        }
        // finding all the substring of this least string.

        List<String> substrings = new ArrayList<>();

        for (int i = 0; i <leastStringLenght.length() ; i++) {
            for (int j = i +1; j<=leastStringLenght.length(); j++) {
                substrings.add(leastStringLenght.substring(i, j));
            }
        }

        String ans = "";
        for ( String check: substrings) {
            boolean presentInAll = true;
            for (int i = 1; i < strs.length; i++) {
                if (!strs[i].contains(check)) {
                    presentInAll = false;
                    break;
                }
            }
            if (presentInAll) {
                ans = check.length() > ans.length() ? check : ans;
            }
        }

        return ans;
    }
}
