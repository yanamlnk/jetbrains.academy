import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int n = scanner.nextInt();

        int result = 0;

        for (int i = start; i <= end; i++) {
            if (i % n == 0) {
                result++;
            }
        }

        System.out.print(result);
    }
}