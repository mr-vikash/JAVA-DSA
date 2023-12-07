public class PrimeNumber {
    public static void main(String[] args) {
        findPrimeNumber(5);

    }

    public static void findPrimeNumber(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Given Number is not prime");
                return;
            }
        }

        System.out.println("Given Number is Prime ");
    }
}
