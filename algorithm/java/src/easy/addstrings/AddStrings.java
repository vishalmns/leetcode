package easy.addstrings;

// //https://leetcode.com/problems/add-strings/

public class AddStrings {
    public String addStrings(String num1, String num2) {
        int len = Math.max(num1.length(), num2.length());
        StringBuilder stringBuilder = new StringBuilder();

        int carry = 0;
        for (int i = 1; i <= len; i++) {
            int a = i <= num1.length() ? Integer.parseInt(String.valueOf(num1.charAt(num1.length() - i))) : 0;
            int b = i <= num2.length() ? Integer.parseInt(String.valueOf(num2.charAt(num2.length() - i))) : 0;
            int sum = a + b + carry;
            carry = sum / 10;
            int ans = sum % 10;
            stringBuilder.append(ans);
        }

        if (carry != 0) {
            stringBuilder.append(carry);
        }


        return stringBuilder.reverse().toString();
    }
}
