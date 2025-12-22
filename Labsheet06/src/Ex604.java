import java.util.Scanner;

public class Ex604 {
    public static Scanner scanner = new Scanner(System.in);
    public static int input_length(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number to input: ");
        int number = scanner.nextInt();
        while (number<=1){
            System.out.print("How many number to input: ");
            number = scanner.nextInt();
        }
        return number;
    }

    public static int[] input_array(int length){
        int[] numbers = new int[length];
        for (int i=0;i<numbers.length;i++){
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static int count_even(int... numbers){
        int count = 0;
        for (int num : numbers){
            if (num % 2 == 0);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
       // int lenght = input_length();
      //  int[] numbers = input_array(lenght);

        int[] numbers = input_array(input_length());

        for (int num : numbers){
            System.out.println(num);
        }
    }
}
