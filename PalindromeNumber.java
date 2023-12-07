public class PalindromeNumber {
    public static void main(String[] args) {
        findPalindromeNumber(121);
    }

    public static void findPalindromeNumber(int num) {
        int res = 0;
        int copy = num;
        while (num > 0) {
            int unitDigit = num % 10;
            res = res * 10 + unitDigit;
            num = num / 10;
        }

        if (copy == res) {
            System.out.println("The Given Number is palindrome");
        } else {
            System.out.println("Given Number is Not Palindrom Number");
        }
    }
}
