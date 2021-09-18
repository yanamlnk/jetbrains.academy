import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String number = scanner.next();
        char a = number.charAt(0);
        char b = number.charAt(1);
        char c = number.charAt(2);
        char d = number.charAt(3);
        
        if (a == d && b == c) {
            System.out.print(1);
        } else {
            System.out.print(37);
        }
    }
}
