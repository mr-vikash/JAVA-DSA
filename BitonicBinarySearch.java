public class BitonicBinarySearch {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 8, 45, 23, 11, 9, 7 };
        int target = 11;
        findMinInBitonic(arr);
        int peakIndex = findPeakInBitonic(arr);
        System.out.println("Peak ELement present at " + peakIndex);
        searchInBitonic(arr, peakIndex, target);
    }

    private static void findMinInBitonic(int[] arr) {
        int res1 = arr[0];
        int res2 = arr[arr.length - 1];
        int min = Math.min(res1, res2);
        System.out.println("Minimum Element is " + min);
    }

    private static int findPeakInBitonic(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int prev = (mid - 1 + arr.length) % arr.length;
            int next = (mid + 1) % arr.length;

            if (arr[mid] > arr[prev] && arr[mid] > arr[next]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    private static void searchInBitonic(int[] arr, int peakIndex, int target) {
        int ans = -1;
        if (arr[peakIndex] == target) {
            System.out.println("Element " + arr[peakIndex] + " Present at index " + peakIndex);
        } else {
            ans = binarySearchIn(arr, target, 0, peakIndex - 1);
            if (ans == -1) {
                ans = binarySearchDec(arr, target, peakIndex + 1, arr.length - 1);
            }
            if (ans == -1) {
                System.out.println("Element not present in Bitonic Array");
            } else {
                System.out.println("Element " + arr[ans] + " Present in Bitonic Array at index " + ans);
            }

        }

    }

    private static int binarySearchIn(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int binarySearchDec(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) { // {10,9,8,7,6,5}
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
