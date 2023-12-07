public class EuclideanGCD {
    public static void main(String[] args) {
        int num1 = 5, num2 = 5;
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        int gcd = Math.max(num1, num2);
        System.out.println("GCD IS = " + gcd);
    }
}
