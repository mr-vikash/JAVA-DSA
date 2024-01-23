
public class DecimalToBinary {
    public static void main(String[] args) {
        decimalToBinary(10);
        decimalToAnyBase(8, 8); // if you want convert in anybase like octal, hexadecimal etc then you have to
                                // give num and base both;
    }

    public static void decimalToBinary(int num) {
        int res = 0;
        int power = 0;
        while (num != 0) {
            int rem = num % 2;
            res = res + (int) rem * (int) Math.pow(10, power);
            num = num / 2;
            power++;
        }
        System.out.println("The Binary No is = " + res);
    }

    public static void decimalToAnyBase(int num, int base) {
        int res = 0;
        int power = 0;
        while (num > 0) {
            int rem = num % base;
            res += rem * (Math.pow(10, power));
            power++;
            num = num / base;
        }
        System.out.println("The Decimal to anybase no is = " + res);
    }

}
