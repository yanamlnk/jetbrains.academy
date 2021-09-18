import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();

        boolean check = city.endsWith("burg");

        System.out.print(check);
    }
}