import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enemies = scanner.nextInt();

        if (enemies < 1) {
            System.out.print("no army");
        } else if (enemies >= 1 && enemies <= 19) {
            System.out.print("pack");
        } else if (enemies >= 20 && enemies <= 249) {
            System.out.print("throng");
        } else if (enemies >= 250 && enemies <= 999) {
            System.out.print("zounds");
        } else if (enemies >= 1000) {
            System.out.print("legion");
        }
    }
}