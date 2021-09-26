package machine;


// create 2 files with 2 classes. 1st will take input, second, here, will have different methods to execute.

public class CoffeeMachine_old{
    public static void main(String[] args) {

        MachineCore core = new MachineCore();

        String coffee;
        boolean machine = true;

        while (machine) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");

            switch (core.inputer()) {
                case "buy":
                    core.buy();
                    break;
                case "fill":
                    core.fill();
                    break;

                case "take":
                    core.take();
                    break;

                case "remaining":
                    core.remaining();
                    break;

                case "exit":
                    machine = false;
                    break;

                default:
                    System.out.println("Please write down correct input");
                    break;
            }
        }
    }
}

        // program to count whether the desirable number of cups is possible:

        /* Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();

        int availableWater = water / 200;
        int availableMilk = milk / 50;
        int availableBeans = beans / 15;

        int possibleCups = 0;

        if (availableWater <= availableMilk && availableWater <= availableBeans) {
            possibleCups = availableWater;
        } else if (availableMilk <= availableWater && availableMilk <= availableBeans) {
            possibleCups = availableMilk;
        } else {
            possibleCups = availableBeans;
        }

        if (cups == possibleCups) {
            System.out.print("Yes, I can make that amount of coffee");
        } else if (cups < possibleCups) {
            int n = possibleCups - cups;
            System.out.print("Yes, I can make that amount of coffee " +
                    "(and even " + n + " more than that)");
        } else {
            System.out.print("No, I can make only " + possibleCups +
                    " cup(s) of coffee");
        } */

        // program to count number of ingredients needed for desired number of cups:

        /* System.out.print("Write how many cups of coffee you will need: ");

        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();

        int water = cups * 200;
        int milk = cups * 50;
        int coffee = cups * 15;

        System.out.print("For " + cups + " cups of coffee you will need:\n" +
                         water + " ml of water\n" + milk + " ml of milk\n" +
                         coffee + " g of coffee beans"); */


