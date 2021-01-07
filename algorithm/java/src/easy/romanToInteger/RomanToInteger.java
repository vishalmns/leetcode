package easy.romanToInteger;

//https://leetcode.com/problems/roman-to-integer/

/*
learning :
1) use switch instead of hashmap you dont want to store the value and waste memory.
2) roman depends only on the previous low value.

https://leetcode.com/problems/roman-to-integer/discuss/1005616/My-Java-solution-beats-99.94
 */

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInteger(String roman) {

        Map<Character, Integer> rti = new HashMap<Character, Integer>();

        rti.put('I', 1);
        rti.put('V', 5);
        rti.put('X', 10);
        rti.put('L', 50);
        rti.put('C', 100);
        rti.put('D', 500);
        rti.put('M', 1000);

        char[] romanCharArray = roman.toCharArray();
        int temp = 0;
        int answer = 0;
        for (char ch: romanCharArray) {
            Integer currentRomanIntValue = rti.get(ch);

            if(temp != 0 && temp < currentRomanIntValue) {
                answer = answer + currentRomanIntValue - (2 * temp);
                temp = 0;
            }
            else {
                answer += currentRomanIntValue;
                temp = currentRomanIntValue;
            }
        }

        return answer;
    }
}
