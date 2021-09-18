import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean result = false;
        int len = scanner.nextInt();

        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int check = scanner.nextInt();

        for (int j : array) {
            if (j == check) {
                result = true;
                break;
            }
        }

        System.out.print(result);
    }
}