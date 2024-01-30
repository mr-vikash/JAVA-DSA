import java.util.Scanner;

public class InsertINArray {
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // fillArray(arr);

        // printArray(arr);
        // System.out.println("Enter the positon for Insert the element in Aray");
        // Scanner sc = new Scanner(System.in);
        // int pos = sc.nextInt();
        // insertAtMid(arr, pos);

        int arr[][] = new int[3][3];

        // int jackedarr[][] = new int[3][]; //jacked array

        // fill2dArray(jackedarr);
        fill2dArray(arr);
        System.out.println("------------Before Insertion----------------");
        print2dArray(arr);

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert The Element");
        int element = sc.nextInt();
        System.out.println("Enter the Ith Position");
        int pos1 = sc.nextInt();
        System.out.println("Enter the Jth Position");
        int pos2 = sc.nextInt();
        insertIn2dArray(arr, element, pos1, pos2);

        System.out.println("--------------After Insertion---------");

        print2dArray(arr);

        System.out.println("delete Element from 2D array");
        System.out.println("Enter the Ith Position");
        int i = sc.nextInt();
        System.out.println("Enter the Jth Position");
        int j = sc.nextInt();
        deleteIn2dArray(arr, i, j);

        System.out.println("--------------After Deletion---------");

        print2dArray(arr);

        // printArray(arr);

    }

    // public static void fillArray(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = i + 1;
    // }
    // }

    public static void fill2dArray(int arr[][]) {

        int customsize = 3;

        for (int i = 0; i < arr.length; i++) {
            // arr[i] = new int[customsize]; for jacked array
            // customsize--;
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the Value at" + i + "Index");
                Scanner in = new Scanner(System.in);
                int element = in.nextInt();
                arr[i][j] = element;
            }
            System.out.println();
        }

    }

    public static void print2dArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            printArray(arr[i]);
        }
    }

    public static void insertAtMid(int arr[], int pos, int element) {

        for (int i = arr.length - 2; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }

        arr[pos] = element;

    }

    public static void insertIn2dArray(int arr[][], int element, int pos1, int pos2) {

        insertAtMid(arr[pos1], pos2, element);

    }

    public static void delete(int arr[], int pos) {
        for (int i = pos; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void deleteIn2dArray(int arr[][], int pos1, int pos2) {
        // for (int i = pos2; i <= arr[pos1].length - 2; i++) { // this code will also
        // work
        // arr[pos1][i] = arr[pos1][i + 1];
        // }
        // arr[pos1][arr[pos1].length - 1] = 0; 
        delete(arr[pos1], pos2);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i] + " ");
            }
        }
    }

}
