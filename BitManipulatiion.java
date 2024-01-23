public class BitManipulatiion {
    public static void main(String[] args) {
        printBits(15);
        // findEvenOdd(45);
        // int bit = 5;// how many number you want to shift
        // int res1 = setIthBit(32, bit);
        // printBits(32);
        // int res2 = toggleIthBit(32, bit);
        // printBits(res2);
        // int res3 = unSetIthBit(32, bit);
        // printBits(res3);
        // isPowerOfTwo(33);
        // int res4 = unSetRightMostSetBit(32);
        // printBits(res4);
        int res5 = countNoOfSetBits(15);
        System.out.println(res5);

    }

    public static void printBits(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num) >> i & 1);
        }
        System.out.println();
    }

    public static void findEvenOdd(int num) {
        int bit = 0;
        if (isBitSet(num, bit)) {
            System.out.println("No is odd " + num);
        } else {
            System.out.println("No is Even " + num);
        }
    }

    public static boolean isBitSet(int num, int bit) {
        int res = num & (1 << bit);
        return (res == 0 ? false : true);
    }

    public static int setIthBit(int num, int bit) {
        return num | (1 << bit);

    }

    public static int unSetIthBit(int num, int bit) {
        return num & ~(1 << bit);
    }

    public static int toggleIthBit(int num, int bit) {
        return num ^ (1 << bit);
    }

    public static void isPowerOfTwo(int num) {
        if ((num & num - 1) == 0) {
            System.out.println("No is in power of 2");
        } else {
            System.out.println("No is not in power of 2");
        }
    }

    private static int unSetRightMostSetBit(int num) {
        return (num & num - 1);
    }

    private static int countNoOfSetBits(int num) {
        int count = 0;
        while (num != 0) {
            num = (num & num - 1);
            count++;
        }
        return count;
    }
}
