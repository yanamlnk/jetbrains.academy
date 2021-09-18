import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;

        int number;
        do {
            number = scanner.nextInt();
            result = number > result ? number : result;
        } while (number != 0);

        System.out.print(result);
    }
}