package GuessGame;

import java.util.Random;
import java.util.Scanner;

public class guessGame {
    int userInput;
    int computerInput;
    int noOfGuess = 1;

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    public guessGame(Random random){
        computerInput = random.nextInt(100);
    }

    public int isTheGuessCorrect(){
        if (userInput == computerInput){
            return 0;
        }
        else if (userInput > computerInput) {
          return 1;
        }
        else {
            return 2;
        }
    }
}

class gameStart{
    public static void main(String[] args) {
        guessGame firstGame = new guessGame(new Random());

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("Enter your Guess: ");
            firstGame.setUserInput(firstGame.userInput = sc.nextInt());
            if(firstGame.isTheGuessCorrect() == 0){
                System.out.println("Congratulation! You Win after " + firstGame.noOfGuess + " tries");
                break;
            }
            else if (firstGame.isTheGuessCorrect() == 1) {
                System.out.println("Wrong! Guess lower than this.");
            }
            else {
                System.out.println("Wrong! Guess larger than this.");
            }

            firstGame.noOfGuess++;
        }

    }
}
