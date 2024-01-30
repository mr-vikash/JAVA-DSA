public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; // search increasing order array

        int arr1[] = { 7, 6, 5, 4, 3, 2, 1 }; // search decending order array;
        int target = 2;

        binarySearch(arr, target);
        binarySearchDesc(arr1, target);
        binarySearchOrderAgnostic(arr, target);
    }

    private static void binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }
        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index = " + ans);
        }
    }

    public static void binarySearchDesc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
            }
            if (target < arr[mid]) {

                start = mid + 1;
            } else {
                end = mid - 1;

            }
        }
        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index = " + ans);
        }
    }

    public static void binarySearchOrderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] <= arr[end]) {
            binarySearch(arr, target);
        } else {
            binarySearchDesc(arr, target);
        }
    }
}
