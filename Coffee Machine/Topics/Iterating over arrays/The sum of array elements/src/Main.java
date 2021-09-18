import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] num = new int[scanner.nextInt()];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        int result = 0;
        for (int j : num) {
            result += j;
        }

        System.out.print(result);
    }
}