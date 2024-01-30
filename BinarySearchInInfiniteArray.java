public class BinarySearchInInfiniteArray {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 34, 55, 67, 89, 123, 455, 678, 890 };
        int target = 7;
        int rangeArray[] = findRangeArray(arr, target);
        System.out.println("---------------------Range Array--------------------------------");
        for (int i : rangeArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        binarySearch(rangeArray, target);
    }

    public static int[] findRangeArray(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (end < target) {
            start = end;
            end = 2 * end;
        }
        int rangeArray[] = new int[end - start + 1];
        int k = 0;
        for (int i = start; i <= end; i++) {
            rangeArray[k] = arr[i];
            k++;

        }
        return rangeArray;
    }

    public static void binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                System.out.println("target present at index " + mid);
                break;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
    }
}
