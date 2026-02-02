import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //no.1
        /*System.out.println("Birthday Cake's Details:");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor: ");
        String flavor = scanner.next();
        System.out.print("How many pound: ");
        double pound = scanner.nextDouble();

        //No.2
        BirthdayCake order1 = new BirthdayCake(message, pound, flavor, 350);

        //No.3
        System.out.println(order1);
        System.out.println();

        //No.4
        System.out.println("Cup Cake's Details:");
        System.out.print("Enter a flavor: ");
        String cup_flavor = scanner.next();
        System.out.print("How many piece: ");
        int piece = scanner.nextInt();

        //No.5
        CupCake order2 = new CupCake(piece,cup_flavor,65);

        //No.6
        System.out.println(order2);*/

        //No.7
       /* System.out.println("Total price = " +
                (order1.calculateTotalPrice() + order2.calculateTotalPrice()));
        System.out.println();*/

        System.out.println("Sai mai's Details:");
        System.out.print("Enter a flavor: ");
        String sai_flavor = scanner.next();
        System.out.print("How many pack: ");
        int pack = scanner.nextInt();
        Saimai order3 = new Saimai(pack,sai_flavor,30);
        System.out.println(order3);
    }
}
