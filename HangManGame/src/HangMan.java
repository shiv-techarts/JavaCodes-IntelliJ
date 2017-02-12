import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 * Created by shiv on 26/1/17.
 */
public class HangMan {
    public String word;
    public StringBuilder userGuess;

    ArrayList<Character> previousGuess = new ArrayList<>();

    int maxTries = 6;
    int currentTries = 0;

    ArrayList<String> dictionary = new ArrayList<>();
    private static FileReader fileReader;
    private static BufferedReader bufferedFileReader;

    public HangMan() throws IOException {
        initializeStream();
        word = pickWord();
        userGuess = initializeGuess();
    }

    public void initializeStream() throws IOException {
        try {
            File infile = new File("dictionary.txt");
            fileReader = new FileReader(infile);
            bufferedFileReader = new BufferedReader(fileReader);
            String currentLine = bufferedFileReader.readLine();

            while(currentLine != null) {
                dictionary.add(currentLine);
                currentLine = bufferedFileReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Initialization Failed: " + e.getMessage());
        } finally {
            bufferedFileReader.close();
            fileReader.close();
        }
    }

    public String pickWord() {
        Random random = new Random(System.currentTimeMillis());
        int wordIndex = Math.abs(random.nextInt() % dictionary.size());
        return dictionary.get(wordIndex);
    }

    public StringBuilder initializeGuess() {
        StringBuilder current = new StringBuilder();
        int size = word.length() * 2;
        for(int i = 0; i < size; i++) {
            if(i % 2 == 0) {
                current.append("_");
            } else {
                current.append(" ");
            }
        }

        return current;
    }

    public String getFormalCurrentGuess() {
        return "Current Guess: " + userGuess.toString();
    }

    public String drawPicture() {
        switch (currentTries) {
            case 0 : return noPersonDraw();
            case 1 : return addHead();
            case 2 : return addBody();
            case 3 : return addArmDraw();
            case 4 : return addSecondArmDraw();
            case 5 : return addLeg();
            default: return addFullBody();
        }
    }

    private String addLeg() {
        return "|-------  " + "\n" +
                "|      |  " + "\n" +
                "|      O  " + "\n" +
                "|     /|\\ " + "\n" +
                "|      |  " + "\n" +
                "|     /   " + "\n" +
                "|         " + "\n" +
                "|         " + "\n";
    }

    private String addFullBody() {
        return  "|-------  " + "\n" +
                "|      |  " + "\n" +
                "|      O  " + "\n" +
                "|     /|\\ " + "\n" +
                "|      |  " + "\n" +
                "|     / \\ " + "\n" +
                "|         " + "\n" +
                "|         " + "\n";
    }

    private String addSecondArmDraw() {
        return  "|-------  " + "\n" +
                "|      |  " + "\n" +
                "|      O  " + "\n" +
                "|     /|\\ " + "\n" +
                "|      |  " + "\n" +
                "|         " + "\n" +
                "|         " + "\n" +
                "|         " + "\n";
    }

    private String addArmDraw() {
        return "|-------  " + "\n" +
                "|      |  " + "\n" +
                "|      O  " + "\n" +
                "|     /|  " + "\n" +
                "|      |  " + "\n" +
                "|         " + "\n" +
                "|         " + "\n" +
                "|         " + "\n";
    }

    private String addBody() {
        return  "|-------  " + "\n" +
                "|      |  " + "\n" +
                "|      O  " + "\n" +
                "|      |  " + "\n" +
                "|      |  " + "\n" +
                "|         " + "\n" +
                "|         " + "\n" +
                "|         " + "\n";
    }

    private String addHead() {
        return  "|-------  " + "\n" +
                "|      |  " + "\n" +
                "|      O  " + "\n" +
                "|         " + "\n" +
                "|         " + "\n" +
                "|         " + "\n" +
                "|         " + "\n" +
                "|         " + "\n";
    }

//    "|-------  " + "\n" +
//    "|      |  " + "\n" +
//    "|      O  " + "\n" +
//    "|     /|\\ " + "\n" +
//    "|      |  " + "\n" +
//    "|     / \\ " + "\n" +
//    "|         " + "\n" +
//    "|         " + "\n"

    private String noPersonDraw() {
        return  "|-------  " + "\n" +
                "|      |  " + "\n" +
                "|         " + "\n" +
                "|         " + "\n" +
                "|         " + "\n" +
                "|         " + "\n" +
                "|         " + "\n" +
                "|         " + "\n";
    }


    public boolean gameOver() {
        if(didWeWin()) {
            System.out.println("You Saved Him");
            return true;
        } else if(didWeLose()) {
            System.out.println("You are a killer");
            return true;
        }
        return false;
    }

    private boolean didWeLose() {
        return ( currentTries >= maxTries );
    }

    private boolean didWeWin() {
        String guess = getCondensedGuess();
        return guess.equals(word);
    }

    public boolean playGuess(char guess) {
        boolean isAGoodGuess = false;

        int size = word.length();

        for(int i = 0; i < size; i++) {
            if(word.charAt(i) == guess) {
                userGuess.setCharAt(i * 2, guess);
                isAGoodGuess = true;
                previousGuess.add(guess);
            }
        }
        if(!isAGoodGuess) {
            currentTries++;
        }

        return isAGoodGuess;
    }

    public boolean isAlreadyGuessed(char guess) {
        return previousGuess.contains(guess);
    }

    public String getCondensedGuess() {
        String guess = userGuess.toString();
        return  guess.replace(" ", "");
    }
}
