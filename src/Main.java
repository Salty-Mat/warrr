import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.shuffle();

        deck.split();
        deck.battle();

        System.out.println(deck.toString());


    }
}