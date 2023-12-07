public class BinaryToDecimal {
    public static void main(String[] args) {
        binaryToDecimal(1111);
        anyBaseToDecimal(1111, 8);// we want covert octal no in decimal
    }

    public static void binaryToDecimal(int binary) {
        int res = 0, power = 0;
        while (binary > 0) {
            int unitDigit = binary % 10;
            res += unitDigit * Math.pow(2, power);
            power++;
            binary = binary / 10;
        }
        System.out.println("The Decimal of given Binary No is = " + res);
    }

    public static void anyBaseToDecimal(int anyBaseNum, int base) {
        int res = 0, power = 0;
        while (anyBaseNum > 0) {
            int unitDigit = anyBaseNum % 10;
            res += unitDigit * Math.pow(base, power);
            power++;
            anyBaseNum = anyBaseNum / 10;
        }
        System.out.println("The Decimal of given AnyBase No is = " + res);
    }
}
