package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int money = 550;
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        String coffee;
        boolean machine = true;

        while (machine) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    coffee = scanner.next();
                    if (coffee.equals("back")) {
                        break;
                    } else if (coffee.equals("1")) {
                        cups--;
                        water -= 250;
                        beans -= 16;
                        money += 4;
                        if (cups >= 0 && water >= 0 && beans >= 0) {
                            System.out.println("I have enough resources, making you a coffee!");
                        } else if (cups < 0) {
                            System.out.println("Sorry, not enough disposable cups!");
                            cups++;
                            water += 250;
                            beans += 16;
                            money -=4;
                        } else if (water < 0) {
                            System.out.println("Sorry, not enough water!");
                            cups++;
                            water += 250;
                            beans += 16;
                            money -=4;
                        } else if (beans < 0) {
                            System.out.println("Sorry, not enough coffee beans!");
                            cups++;
                            water += 250;
                            beans += 16;
                            money -=4;
                        }
                    } else if (coffee.equals("2")) {
                        water -= 350;
                        milk -= 75;
                        beans -= 20;
                        money += 7;
                        cups --;
                        if (cups >= 0 && water >= 0 && beans >= 0 && milk >= 0) {
                            System.out.println("I have enough resources, making you a coffee!");
                        } else if (cups < 0) {
                            System.out.println("Sorry, not enough disposable cups!");
                            cups++;
                            water += 350;
                            beans += 20;
                            money -=7;
                            milk += 75;
                        } else if (water < 0) {
                            System.out.println("Sorry, not enough water!");
                            cups++;
                            water += 350;
                            beans += 20;
                            money -=7;
                            milk += 75;
                        } else if (beans < 0) {
                            System.out.println("Sorry, not enough coffee beans!");
                            cups++;
                            water += 350;
                            beans += 20;
                            money -=7;
                            milk += 75;
                        } else if (milk < 0) {
                            System.out.println("Sorry, not enough coffee milk!");
                            cups++;
                            water += 350;
                            beans += 20;
                            money -= 7;
                            milk += 75;
                        }
                    } else if (coffee.equals("3")) {
                        cups--;
                        water -= 200;
                        milk -= 100;
                        beans -= 12;
                        money += 6;
                        if (cups >= 0 && water >= 0 && beans >= 0 && milk >= 0) {
                            System.out.println("I have enough resources, making you a coffee!");
                        } else if (cups < 0) {
                            System.out.println("Sorry, not enough disposable cups!");
                            cups++;
                            water += 200;
                            beans += 12;
                            money -=6;
                            milk += 100;
                        } else if (water < 0) {
                            System.out.println("Sorry, not enough water!");
                            cups++;
                            water += 200;
                            beans += 12;
                            money -=6;
                            milk += 100;
                        } else if (beans < 0) {
                            System.out.println("Sorry, not enough coffee beans!");
                            cups++;
                            water += 200;
                            beans += 12;
                            money -=6;
                            milk += 100;
                        } else if (milk < 0) {
                            System.out.println("Sorry, not enough coffee milk!");
                            cups++;
                            water += 200;
                            beans += 12;
                            money -= 6;
                            milk += 100;
                        }
                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    beans += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    cups += scanner.nextInt();
                    break;

                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;

                case "remaining":
                    System.out.println('\n' + "The coffee machine has:\n" +
                            water + " ml of water\n" +
                            milk + " ml of milk\n" +
                            beans + " g of coffee beans\n" +
                            cups + " disposable cups\n" +
                            "$" + money + " of money");
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

        // program that prints out the process of making a cup of coffee:

        /* System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!"); */
