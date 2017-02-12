import java.util.Scanner;

/**
 * Created by shiv on 26/1/17.
 */
public class HangManGame {

    static {
        System.out.println("Welcome to Game of hangman, if you guess wrong a man will die. \n" +
                "Remember you have 6 chances only....play wisely");
        System.out.println();
        System.out.println("I have picked the word, your word is: ");
    }

    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);
        boolean doYouWantToPlay = true;

        while (doYouWantToPlay) {

            HangMan game = new HangMan();
            System.out.println("Game Start");

            do {
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
                System.out.println();
                System.out.println(game.word);
                System.out.println();

                System.out.println("Enter a character to guess.");
                char guess = ( cin.next().toLowerCase().charAt(0) );

                while (game.isAlreadyGuessed(guess)) {
                    System.out.println("Try Again, Already guessed.");
                    guess = ( cin.next().toLowerCase().charAt(0) );
                }

                if(game.playGuess(guess)) {
                    System.out.println("Great guess.");
                } else {
                    System.out.println("man is closer to death.");
                }

            } while (!game.gameOver());

            System.out.println("Want to play again: (Yes/No) ");
            String choice = cin.nextLine();

            if(!"yes".equals(choice.toLowerCase())) {
                doYouWantToPlay = false;
            }
        }
    }
}
