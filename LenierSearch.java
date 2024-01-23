public class LenierSearch {
    public static void main(String[] args) {

        int arr[] = { 3, 8, 5, 6, 8, 9, 8 };

        int arr2d[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 1, 8, 3 }
        };

        int target = 8;
        boolean findlast;
        findElement(arr, target);

        findElementAtLast(arr, target, findlast = true);

        findMultipleValue(arr, target);
        findMax(arr);
        findMin(arr);
        boolean found;
        findElementIn2d(arr2d, target, found = false);
        findElementIn2dAtLast(arr2d, target);
        findElementMultipleIn2d(arr2d, target);
        findMaximumSubArray(arr2d);
    }

    public static void findElement(int arr[], int target) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                break;
            }
        }
        if (ans == -1) {
            System.out.println("Element not found in the Array");
        } else {
            System.out.println("Element found in the Array at index = " + ans);
        }
    }

    public static void findElementAtLast(int arr[], int target, boolean findlast) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                if (findlast == false) {
                    break;
                }
            }
        }
        if (ans == -1) {
            System.out.println("Element no found");
        } else {
            System.out.println("Element found at index = " + ans);
        }
    }

    public static void findMultipleValue(int arr[], int target) {
        int ans[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans[k] = i;
                k++;
            }
        }
        System.out.println("Ans found at indexes");
        for (int i = 0; i < k; i++) {
            System.out.println(ans[i] + " ");
        }
    }

    public static void findMax(int arr[]) {
        // int max = arr[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max is = " + max);
    }

    public static void findMin(int arr[]) {
        // int min = arr[0];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min is = " + min);
    }

    public static void findElementIn2d(int arr[][], int target, boolean found) {
        int row = 0;
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    row = i;
                    col = j;
                    found = true;
                    break;

                }
                if (found) {
                    break;
                }
            }
        }
        System.out.println("Element found at first occurance arr[" + row + "][" + col
                + "]");
    }

    public static void findElementIn2dAtLast(int arr[][], int target) {
        int row = 0;
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    row = i;
                    col = j;
                    break;

                }
            }
        }
        System.out.println("Element found at Last occurance arr[" + row + "][" + col
                + "]");
    }

    public static void findElementMultipleIn2d(int arr[][], int target) {

        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            size = size + arr[i].length;
        }
        int ans[][] = new int[size][2];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    ans[k][0] = i;
                    ans[k][1] = j;
                    k++;
                }
            }
        }
        if (k == 0) {
            System.out.println("Element not found");
        } else {
            for (int i = 0; i < k; i++) {
                System.out.println("Element found at index = " + ans[i][0] + "," + ans[i][1]);
            }
        }

    }

    public static void findMaximumSubArray(int arr[][]) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        System.out.println("Maximum sum for subarray of " + max + " found at index = " + index);

    }

}
