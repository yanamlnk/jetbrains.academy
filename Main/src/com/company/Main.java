public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; (j < 10) && j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
