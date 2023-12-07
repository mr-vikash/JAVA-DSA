public class FindAllDivisors {
    public static void main(String[] args) {
        allDivisors(36);
    }

    public static void allDivisors(int num) {
        int counter = 1;
        while (counter <= Math.sqrt(num)) {
            if (num % counter == 0) {
                System.out.println("Divisor is " + counter);
                int othernum = num / counter;
                if (othernum != counter) {
                    System.out.println("Divisor is " + othernum);

                }
            }
            counter++;
        }
    }
}
