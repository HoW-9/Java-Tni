import java.util.Scanner;

public class Ex302 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter mid term score: ");
        int midterm = scan.nextInt();

        System.out.print("Enter final score: ");
        int Final = scan.nextInt();

        int total_score = midterm+Final;
        System.out.println("Your score is " + total_score);

        if (total_score < 0 || total_score > 100){
            System.out.print("Error score!!");
        } else {
            if (total_score >= 80){
                System.out.print("You get grade A");
            }else if (total_score >= 70){
                System.out.print("You get grade b");
            }else if (total_score >= 60){
                System.out.print("You get grade C");
            }else if (total_score >= 50){
                System.out.print("You get grade D");
            }else {
                System.out.print("You get grade F");
            }

        }
    }
}
