import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence;

        while (true){
            System.out.print("In put some sentence: ");
            sentence = scan.nextLine();
            if (!sentence.endsWith(".")){
                System.out.print("Then sentence must end with full stop point: ");
                String answer = scan.nextLine();
            }else _{
                break;
            }
        }
    }
}
