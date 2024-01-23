import java.util.Scanner;

class LearnSwitchCase {
    public static void main(String[] args) {
        System.out.println("Program for selecting choices according to the given number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You love fruits");
                break;
            case 2:
                System.out.println("You love vegetables11111111111111111111111111");
                break;
            default:
                System.out.println("You are non vegetarian");
        }
    }
}