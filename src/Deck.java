import java.util.*;

public class Deck {
    ArrayList<Card> playerDeck = new ArrayList<Card>();
    ArrayList<Card> computerDeck = new ArrayList<Card>();
    ArrayList<Card> warDeck = new ArrayList<Card>();
    //52 card
    ArrayList<Card> allDeck = new ArrayList<Card>();

    public Card getPlayerCard(){
        return warDeck.get(0);
    }
    public Card getComputerCard(){
        return warDeck.get(1);
    }
    public ArrayList<Card> getPlayerDeck(){
        return playerDeck;
    }
    public ArrayList<Card> getComputerDeck() {
        return computerDeck;
    }
    public ArrayList<Card> getWarDeck() {
        return warDeck;
    }

    public Deck(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                allDeck.add(new Card(i,j,false));
            }
        }
    }
    public void shuffle(){

        for (int i = 0; i < 200; i++) {
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
            playerDeck.get(i).setPlayer(true); // gives owner ship to the player lmao
            allDeck.remove(i);
        }

        for (int i = 0; i < 26; i++) {
            computerDeck.add(allDeck.get(i)); // duplicates one card for all deck and put it in computer deck
        }
        allDeck.clear(); // java jank lmao
    }

    public void battle(){
        warDeck.add(playerDeck.get(0));
        playerDeck.remove(0);
        warDeck.add(computerDeck.get(0));
        computerDeck.remove(0);

    }
    
    public void realBattle(){
        if(warDeck.get(0).getPoint() < warDeck.get(1).getPoint()){
            if((int)(Math.random()*2) == 1){ // random
                computerDeck.add(warDeck.get(1));
                computerDeck.add(warDeck.get(0));
            } else {
                computerDeck.add(warDeck.get(0));
                computerDeck.add(warDeck.get(1));
            }

            System.out.println("HAHA YOU LOST YOU SUCK HEHEHHW");
        }

        if(warDeck.get(0).getPoint() > warDeck.get(1).getPoint()){
            if((int)(Math.random()*2) == 1){
                playerDeck.add(warDeck.get(1));
                playerDeck.add(warDeck.get(0));
            } else {
                playerDeck.add(warDeck.get(0));
                playerDeck.add(warDeck.get(1));
            }
            System.out.println("PLAYER WON LAMOIA");
        }

        if(warDeck.get(0).getPoint() == warDeck.get(1).getPoint()){
            war();
            System.out.println("tie");
        }

        warDeck.clear();
    }

    public void china(){

        for (int i = 0; i < 4; i++) {
            if (playerDeck.size() == 0){
                break;
            }
            //System.out.println("bruh");
            warDeck.add(playerDeck.get((0)));
            playerDeck.remove(0);
            //--;
        }

        for (int i = 0; i < 4; i++) {
            if (computerDeck.size() == 0){
                break;
            }
            //System.out.println("jdsfjis");
            warDeck.add(computerDeck.get((0)));
            computerDeck.remove(0);
            //i--;
        }
    }

    public void war(){

        //System.out.println("hahwar");
        while (warDeck.get(warDeck.size()-2 ).getPoint() == warDeck.get(warDeck.size()-1).getPoint()) {
            china();
        }


//        System.out.println("1111111111");
        if (warDeck.get(warDeck.size()-2 ).getPoint() < warDeck.get(warDeck.size()-1).getPoint()){
            //System.out.println("AYYYYYYYYYYYYYO");
            for (int i = 0; i < warDeck.size(); i++) {
                computerDeck.add(warDeck.get(i));
            }
        } else if (warDeck.get(warDeck.size()-2 ).getPoint() > warDeck.get(warDeck.size()-1).getPoint()){
            //System.out.println("2222222222222222222222222222");
            for (int i = 0; i < warDeck.size(); i++) {
                playerDeck.add(warDeck.get(i));
            }

        }
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
