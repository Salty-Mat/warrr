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

    // 2,2,33,3,
    //1,

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

    public void split(){

        for (int i = 0; i < 26; i++) {
            //System.out.println(i);
            playerDeck.add(allDeck.get(i)); // duplicates one card for all deck and put it in your deck
            playerDeck.get(i).setPlayer(true);

            allDeck.remove(i);
        }

        for (int i = 0; i < 26; i++) {
            computerDeck.add(allDeck.get(i)); // duplicates one card for all deck and put it in computer deck
        }
        allDeck.clear();
    }


    public void battle(){
        warDeck.add(playerDeck.get(1));
        playerDeck.remove(1);
        warDeck.add(computerDeck.get(1));
        computerDeck.remove(1);

    }


    public String toString() {
        String temp1 = "";
        String temp2 = "";
        String temp3 = "";
        for (int i = 0; i < playerDeck.size(); i++) {
            temp1 += " "+ i +": "+ playerDeck.get(i).toString();

        }
        for (int i = 0; i < computerDeck.size(); i++) {
            temp2 += " "+ i +": "+  computerDeck.get(i).toString();

        }
        for (int i = 0; i < warDeck.size(); i++) {
            temp3 += " "+ i +": "+  warDeck.get(i).toString() + ": "+ warDeck.get(i).getPlayer() ;

        }
        return temp1+ "\n"+ temp2 + "\n" + temp3;

    }
}
