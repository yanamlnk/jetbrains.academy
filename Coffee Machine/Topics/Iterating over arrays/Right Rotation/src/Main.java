import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.util.List.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers;
        numbers = scanner.nextLine().split(" ");

        int n = scanner.nextInt();

        Collections.rotate(of(numbers), n);

        for(String i : numbers) {
            System.out.print(i + " ");
        }
    }
}