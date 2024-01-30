public class BinarySearchLeetCode {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 10 };
        int target = 12;
        boolean isFirst = true;
        int first = BinarySearchFirstOccurance(arr, target, isFirst);
        System.out.println("First occurance of " + target + " is at index : " +
                first);
        int last = BinarySearchLastOccurance(arr, target);
        System.out.println("Last occurance of " + target + " is at index : " + last);
        findCeil(arr, target);
        findFloor(arr, target);
        findMinimalDifferenceBinarySearch(arr, target);

    }

    public static int BinarySearchFirstOccurance(int[] arr, int target, boolean isFirst) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (isFirst) {
                    if (arr[mid] <= target) {
                        end = mid - 1;
                    }
                }
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int BinarySearchLastOccurance(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
            }
            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int BinarySearchFindCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (target < arr[mid + 1]) {
                    ans = arr[mid];
                }
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void findCeil(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = arr[mid];
                break;
            } else if (target < arr[mid]) {
                end = mid - 1;
                ans = arr[mid];
            } else {
                start = mid + 1;

            }

        }
        System.out.println(" The ceil of " + target + " is = " + ans);
    }

    public static void findFloor(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = arr[mid];
                break;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
                ans = arr[mid];
            }

        }
        System.out.println(" The Floor of " + target + " is = " + ans);
    }

    public static void findMinimalDifferenceBinarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        int res = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                System.out.println("Minimal Defference element is " + (target - arr[mid]));
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (ans == -1) {
            if (end == -1) {
                res = Math.abs(target - arr[start]);
                System.out.println("Minimal Defference element is " + res);
            } else if (start == arr.length) {
                res = Math.abs(target - arr[end]);
                System.out.println("Minimal Defference element is " + res);
            } else {
                int res1 = Math.abs(target - arr[start]);
                int res2 = Math.abs(target - arr[end]);
                res = Math.min(res1, res2);
                System.out.println("Minimal Defference element is " + res);

            }

        }
    }
}
