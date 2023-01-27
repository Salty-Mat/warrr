import java.util.*;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();

        play(deck);







        //System.out.println(deck.toString());


    }
    public static void play(Deck newDeck ){
        Scanner scanner = new Scanner(System.in);

        newDeck.shuffle();

        newDeck.split();

        newDeck.battle();

        System.out.println( "      | " + newDeck.getPlayerCard() + " | VS | "+ newDeck.getComputerCard()+ " |" );
        newDeck.realBattle();
        System.out.println(" ");
        System.out.println("your cards remaining: " + newDeck.getPlayerDeck().size()+"               "+ "computer cards reminng: "+ newDeck.getComputerDeck().size());

        String str = scanner.nextLine();
        if(newDeck.getPlayerDeck().size() == 0){
            return;
        }
        play(newDeck);


    }
}