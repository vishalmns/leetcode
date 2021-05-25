package easy.implementStrStr;

//https://leetcode.com/problems/implement-strstr/

public class ImplementStrStr {
    public int implementStrStr(String haystack, String needle ) {

        if (needle.isEmpty()) {
            return 0;
        }

        char[] haystackChars = haystack.toCharArray();
        char[]  needleChars = needle.toCharArray();

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean present = true;
            for (int j = 0; j < needle.length(); j++) {
                if(haystackChars[i+j] != needleChars[j]) {
                    present = false;
                    break;
                }
            }
            if (present) {
                return i;
            }
        }

    return -1;

    }
}
