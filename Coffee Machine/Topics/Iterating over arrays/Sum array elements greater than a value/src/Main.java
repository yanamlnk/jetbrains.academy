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
        int result = 0;

        for (int x : numbers) {
            if (x > n) {
                result += x;
            }
        }
        System.out.println(result);
    }
}