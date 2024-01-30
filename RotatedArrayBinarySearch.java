public class RotatedArrayBinarySearch {
    public static void main(String[] args) {
        int arr[] = { 7, 1, 2, 3, 4, 5, 6 };
        int minIndex = findMinInRotatedArray(arr);
        rotationCountInClockWise(minIndex);
        rotationCountAntiClockWise(minIndex, arr);
        System.out.println("Minimum Element present at index " + minIndex);
        int maxIndex = findMaxInRotatedArray(arr);
        System.out.println("Max Element is present at Index = " + maxIndex);
    }

    private static int findMinInRotatedArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid > 0 && arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[end]) // means our answer will not lie in sorted half
            {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private static int findMaxInRotatedArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private static void rotationCountInClockWise(int minIndex) {
        System.out.println("Clock wise Rotation count is = " + minIndex);
    }

    private static void rotationCountAntiClockWise(int minIndex, int arr[]) {
        int rcount = (arr.length - minIndex) % arr.length;
        System.out.println("Rotation count AnticlockWise in Given Array is = " + rcount);

    }

}
