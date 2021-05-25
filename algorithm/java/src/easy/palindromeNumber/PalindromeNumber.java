package easy.palindromeNumber;

public class PalindromeNumber {
    public boolean isPalindrome(Integer number) {

        int originalNumber = number;

        if (number < 0) {
            return false;
        }

        if (number < 9) {
            return true;
        }

        int reverse = 0;

        while(number !=0) {
            int digit = number % 10;
            reverse = (reverse * 10) + digit;
            number = number/10;
        }

        if (reverse == originalNumber) {
            return true;
        }
        return false;
    }
}
