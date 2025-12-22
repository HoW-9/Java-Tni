import java.util.Scanner;

public class Lab601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0;i<numbers.length;i++){

                System.out.print("Enter number " + (i+1) + ": " );
                int num = scanner.nextInt();

                while (num<=0){
                    System.out.print("the number must be postive! Enter number again: ");
                    num = scanner.nextInt();
                }
                numbers[i] = num;
        }
        System.out.print("\nList of even number: ");
        for (int num_ : numbers){
            if (num_%2==0){
                System.out.print(num_+" ");
            }
        }
        System.out.print("\nList of odd number: ");
        for (int num_ : numbers){
            if (num_%2!=0){
                System.out.print(num_+" ");}
        }

    }
}
