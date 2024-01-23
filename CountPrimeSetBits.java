import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class CountPrimeSetBits {
    public static void main(String[] args) {
        int temp = 0;
        Set<Integer> list = new HashSet<Integer>();
        int left = 6;
        int right = 10;
        for (int i = left; i <= right; i++) {
            temp = i;
            int bin = 0;
            int power = 0;
            int count = 0;

            while (temp != 0) {
                int rem = temp % 2;
                bin = bin + (int) rem * (int) Math.pow(10, power);
                temp = temp / 2;
                power++;
            }

            int len = String.valueOf(bin).length();

            for (int j = 0; j < len; j++) {
                int res = i >> j & 1;
                if (res == 1) {
                    count++;
                }
            }

            list.add(count);
        }

        System.out.println(list);
    }
}
