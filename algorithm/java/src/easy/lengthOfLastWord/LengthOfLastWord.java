package easy.lengthOfLastWord;

//https://leetcode.com/problems/length-of-last-word/

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        if (s.isEmpty() || s.isBlank()) {
            return 0;
        }

        String[] strs = s.split(" ");

        return strs[strs.length - 1].length();
    }

    public int betterSolution(String s) {
        var len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                len++;
            } else if (len > 0) {
                return len;
            }
        }
        return len;
    }
}
