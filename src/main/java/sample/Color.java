package sample;

import java.util.Random;

public class Color {

    private String[] suit = new String[] {
            "Diamonds",
            "Hearts",
            "Spades",
            "Clubs"
    };

    public String getSuit() {
        Random random = new Random();
        int randomNumber = random.nextInt(4);
        return suit[randomNumber];
    }
}
