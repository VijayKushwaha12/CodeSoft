package CodeSoft;
import java.util.Random;
import java.util.Scanner;

public class Number_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();

        int Genrated_no = rm.nextInt(100);

        int count = 0;
        int x;

        do{
        for (int i = 0; i < 5; i++) {
            System.out.print("Guess the genrated number :- ");
            int Guess_no = sc.nextInt();

            if (Guess_no == Genrated_no) {
                System.out.println("Congratulation!,Your guess the correct number.");
                count++;
                break;
            } else {
                System.out.println("Try Again!");

                if(Guess_no > Genrated_no){
                    System.out.println("You guess too high number.");
                }else if(Guess_no < Genrated_no){
                    System.out.println("You guess too low number.");
                }
            }

            
        }
    
        System.out.println("Your score :-"+ count);
        System.out.println("Press 1 for play again");
        x =sc.nextInt();
    }while(x == 1);
    }
}
