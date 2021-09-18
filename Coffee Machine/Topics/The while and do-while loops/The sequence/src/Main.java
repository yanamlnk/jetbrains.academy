import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();
        int result = 0;
        int number;

        while (scanner.hasNext()) {
            number = scanner.nextInt();
            if (number % 4 == 0 && number > result) {
                result = number;
            }
        }

        System.out.print(result);
    }
}