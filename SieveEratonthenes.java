import java.util.Arrays;

public class SieveEratonthenes {
    public static void main(String[] args) {
        int size = 50;
        boolean arr[] = new boolean[size + 1];

        Arrays.fill(arr, true);
        int counter = 2;
        while (counter <= size) {

            if (arr[counter] == true) {
                for (int factor = counter + counter; factor <= size; factor = factor + counter) {
                    arr[factor] = false;
                }
            }
            counter++;
        }

        for (int i = 2; i <= size; i++) {
            if (arr[i] == true) {
                System.out.println("Prrime No = " + i);
            }
        }

    }
}
