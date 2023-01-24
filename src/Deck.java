import java.util.*;

public class Deck {
    ArrayList<Card> playerDeck = new ArrayList<Card>();
    ArrayList<Card> computerDeck = new ArrayList<Card>();
    ArrayList<Card> warDeck = new ArrayList<Card>();

    //52 card
    ArrayList<Card> allDeck = new ArrayList<Card>();

    public Deck(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                allDeck.add(new Card(i,j));
            }
        }
    }

    public void shuffle(){
        for (int i = 0; i < 52; i++) {
            int rand = (int) (Math.random()*52); //randomizing
            Card temp;
            temp = allDeck.get(rand); //  putting card into hand
            allDeck.remove(rand); // remove the one in your hand from the deck
            rand = (int) (Math.random()*52); // rerolling random
            allDeck.add(rand, temp);// putting back in deck


        }
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < allDeck.size(); i++) {
            temp += " "+ allDeck.get(i).toString();

        }
        return temp;

    }
}
