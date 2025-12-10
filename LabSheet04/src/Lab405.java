import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence;

        while (true) {
            System.out.print("Input some sentence: ");
            sentence = scan.nextLine();

            if (!sentence.endsWith(".")) {

                while (true) {
                    System.out.print("The sentence must end with full stop point: ");
                    sentence = scan.nextLine();

                    if (sentence.endsWith(".")) {
                        break;
                    }
                }
            }
            break;
        }
        sentence = sentence. substring(0,sentence.length() - 1);
        for (String word : sentence.split(" ")) {
            System.out.println(word);
        }
        scan.close();
    }
}
