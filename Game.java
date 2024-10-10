import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //random number from 1-100
        int randomNumber = random.nextInt(100) + 1;

        //welcome Message
        System.out.println("Welcome to the Number Guessing Game!\n" +
                "I'm thinking of a number between 1 and 100.\n" +
                "You have 5 chances to guess the correct number.");

        //select difficulty options
        System.out.println("Please select the difficulty level:\n" +
                "1. Easy (10 chances)\n" +
                "2. Medium (5 chances)\n" +
                "3. Hard (3 chances)");
        int difficulty = scanner.nextInt();

        int chances = 0;
        int attempts = 0;
        String difficultyName = null;
        switch(difficulty) {
            case 1:
                chances = 10;
                difficultyName = "Easy";
                break;
            case 2:
                chances = 5;
                difficultyName = "Medium";
                break;
            case 3:
                chances = 3;
                difficultyName = "Hard";
                break;
        }
        
        System.out.println("Great! You have selected the " + difficultyName + " difficulty level.\n" +
                "Let's start the game!");
        
        while(chances > 0){
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            if(choice == randomNumber){
                attempts++;
                System.out.println("Congratulations! You guessed the correct number in "+attempts+" attempts.");
                break;
            }
            else{
                attempts++;
                chances--;
                if (choice > randomNumber) {
                    System.out.println("Incorrect! The number is smaller than " + choice);
                } else {
                    System.out.println("Incorrect! The number is greater than " + choice);
                }
            }
        }
    }
}