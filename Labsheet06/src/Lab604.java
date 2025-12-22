import java.util.Scanner;

public class Lab604 {
    public static void display_array(int[] numbers){
        System.out.print("List of numbers in array: ");
        for (int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int input_index(int[] numbers){
        Scanner scanner = new Scanner(System.in);
        int index;
        while (true) {
            System.out.print("Enter index: ");
            index = scanner.nextInt();
            if (check_index(numbers,index)){
                return index;
            }else {
                System.out.print("Invaild index!! Enter index,again: ");
            }
        }
    }
    public static boolean check_index(int[] numbers,int index){
        return index >= 0 && index < numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers = {47, 13, 82, 17, 61, 29, 94, 36};
        display_array(numbers);
        int index = input_index(numbers);
        System.out.println("\nThe number at index "+ index + " is " + numbers[index]);
        if (index-1>=0){
            System.out.println("The number at index "+ index + " is " + numbers[index-1]);
        }else {
            System.out.println("The number before "+ index + " is Out of range!!" );
        }
        if (index+1< numbers.length){
            System.out.println("The number before "+ index + " is " + numbers[index+1]);
        }else {
            System.out.println("The number after "+ index + " is Out of range!!" );
        }
    }
}
