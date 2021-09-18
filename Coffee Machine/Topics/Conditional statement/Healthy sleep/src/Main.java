import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int mySleep = scanner.nextInt();

        if (min > max) {
            System.out.print("Wrong input, minimum amount of sleep" +
                             "must be lower than maximum");
        } else if (min <= mySleep && mySleep <= max) {
            System.out.print("Normal");
        } else if (min > mySleep) {
            System.out.print("Deficiency");
        } else if (max < mySleep) {
            System.out.print("Excess");
        }
    }
}