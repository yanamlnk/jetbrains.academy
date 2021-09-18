import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxNumber = 0;
        int result = 0;

        for (int j : numbers) {
            if (j > maxNumber) {
                maxNumber = j;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == maxNumber) {
                result = i;
                break;
            }
        }

        System.out.print(result);
    }
}