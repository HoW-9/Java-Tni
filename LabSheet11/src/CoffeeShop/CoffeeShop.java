package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {
    public static int espressoCount = 0;
    public static int frappucinoCount = 0;
    public static int totalIncome = 0;
    public static Espresso orderEspresso(Scanner scanner){
        System.out.print("Enter a size: ");
        String size = scanner.next();
        Espresso espresso = new Espresso(size);
        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        char ans = scanner.next().charAt(0);
        if (ans == 'Y' || ans == 'y'){
            System.out.print("How many shots for adding in Espresso: ");
            int add_shot = scanner.nextInt();
            for (int i = 0;i>add_shot;i++){

            }
        }
        return espresso;
    }
    public static void main(String[] args) {

    }
}
