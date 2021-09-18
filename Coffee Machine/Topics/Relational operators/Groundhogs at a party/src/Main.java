import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean workdaySuccess = cups >= 10 && cups <= 20 && !weekend;
        boolean weekendSuccess = cups >= 15 && cups <= 25 && weekend;

        boolean success = workdaySuccess || weekendSuccess;

        System.out.print(success);
    }
}
