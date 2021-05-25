package easy.longestCommonPrefix;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {
        String[] s = new String[2];
        s[0] = "kha";
        s[1] = "abcd";
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.longestCommonPrefix(s);
    }
}