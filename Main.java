import java.util.Scanner;

public class Main {
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
                    if (coffee == "back") {
                        break;
                    } else if (coffee == "espresso") {
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
                    } else if (coffee == "2") {
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
                    } else if (coffee == "3") {
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
                    System.out.print("Write how many disposable cups of coffee you want to add:");
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
                    System.out.print("Please write down correct input");
                    break;
            }
        }
    }
}
