public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(189981));
        System.out.println(isPalindrome(-1234522));
        System.out.println(isPalindrome(81818));
        System.out.println(isPalindrome(239023));
        System.out.println(isPalindrome(9));
        System.out.println(isPalindrome(1881));
    }

    public static boolean isPalindrome(int numberTest){
        int reverse = 0;
        int lastDigit;
        int num = numberTest;
        while (num != 0) {
            lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }
        if (reverse == numberTest) {
            return true;
        } else {
            return false;
        }


    };
}
