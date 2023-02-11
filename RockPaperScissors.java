import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {
    public static void main(String[] args) {
        /*
           0 = Rocks;
           1 = Paper;
           2 = Scissors;
        */
        System.out.println("Rock = 0     Paper = 1     Scissors = 2");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int userInput = sc.nextInt(3);

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
          || userInput == 2 && computerInput == 1){
            System.out.println("You Win!");
        }
        else if (userInput == computerInput) {
            System.out.println("Draw");
        }
        else {
            System.out.println("Computer Win!");
        }

        if (computerInput == 0){
            System.out.println("Computer's Choice: Rock");
        }
        else if (computerInput == 1){
            System.out.println("Computer's Choice: Paper");
        }
        else if (computerInput == 2){
            System.out.println("Computer's Choice: Scissors");
        }

    }
}
