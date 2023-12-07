public class CountDigit {
    public static void main(String[] args) {
        countDigit(3456789);
        countDigitUsingLog(345678);
    }

    public static void countDigit(int num) {
        int counter = 0;
        while (num > 0) {
            num = num / 10;
            counter++;
        }
        System.out.println("The Digits in given no is = " + counter);
    }

    public static void countDigitUsingLog(int num) {
        int res = (int) Math.log10(num) + 1;
        System.out.println("The Digits in Given No is = " + res);
    }
}
