import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean result1 = a > 0 ^ b > 0 && c <= 0;
        boolean result2 = a > 0 ^ c > 0 && b <= 0;
        boolean result3 = b > 0 ^ c > 0 && a <= 0;

        System.out.print(result1 || result2 || result3);

    }
}
