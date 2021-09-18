import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] numbers = new int[len];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean result = false;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == n && numbers[i - 1] == m) {
                result = true;
            } else if (numbers[i] == m && numbers[i - 1] == n) {
                result = true;
            }
        }

        System.out.print(result);
    }
}