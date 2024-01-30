public class FindMidIndexLeetCode {
    public static void main(String[] args) {

        int nums[] = { 2, 3, -1, 8, 4 };
        int index = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int lcount = 0;
            int rcount = 0;
            for (int j = 0; j < i; j++) {
                lcount += nums[j];
            }
            for (int k = i + 1; k < n; k++) {
                rcount += nums[k];
            }
            if (lcount == rcount) {
                index = i;
                break;
            }
        }
        System.out.println("The index of Element, Where from the sum of right side and left side is equal = " + index);

    }
}
