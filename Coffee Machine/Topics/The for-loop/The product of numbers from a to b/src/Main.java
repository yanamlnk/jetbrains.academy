import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        long product = 1;

        for (int i = a; i < b; i++) {
            product *= i;
        }

        System.out.print(product);
    }
}