public class ArmstrongNumber {
    public static void main(String[] args) {
        findArmstrong(121);
    }

    public static void findArmstrong(int num) {
        int res = 0;
        int copy = 153;
        while (num > 0) {
            int unitDigit = num % 10;
            res += Math.pow(unitDigit, 3);
            num = num / 10;
        }

        if (res == copy) {
            System.out.println("The Given Number is Armstrong Number");
        } else {
            System.out.println("The Given Number is Not Armstrong Number");
        }
    }
}
