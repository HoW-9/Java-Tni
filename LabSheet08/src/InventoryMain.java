import java.util.Scanner;

public class InventoryMain {
    public static void showInfo(Inventory product){
        System.out.println("Product name : " + product.getName());
        System.out.println("Current stock: " + product.getStock());
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        // No.1
        Inventory product1 = new Inventory("Pen",10);

        while (true) {
        // No.2
            showInfo(product1);

            // No.3
            System.out.println("Press 1 add item in stock");
            System.out.println("Press 2 remove item from stock");
            System.out.print("Enter a menu: ");
            int menu = scanner.nextInt();

            // No.4
            if (menu == 1) {
                System.out.print("how many item to add in stock: ");
                product1.addStock(scanner.nextInt());
            }

            // No.5
            if (menu == 2) {
                System.out.print("how many item to remove from stock: ");
                product1.removeStock(scanner.nextInt());
            } else {
                break;
            }
        }
        // No.6
        System.out.println("END PROGRAM");
    }
}
