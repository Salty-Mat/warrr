import java.util.*;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();

        Scanner scanner = new Scanner(System.in);

        boolean inGame = true;

        deck.shuffle();

        deck.split();

//        for (int i = 0; i < 3; i++) {
//            deck.battle();
//
//            System.out.println( "      | " + deck.getPlayerCard() + " | VS | "+ deck.getComputerCard()+ " |" );
//            deck.realBattle();
//            System.out.println(" ");
//            System.out.println("your cards remaining: " + deck.getPlayerDeck().size()+"               "+ "computer cards reminng: "+ deck.getComputerDeck().size());
//
//            System.out.println(deck.toString());
//
//            if (deck.getPlayerDeck().size() == 0 || deck.getComputerDeck().size() == 0){
//                inGame = false;
//            }
//        }


        while (inGame){

            deck.battle();

            System.out.println( "      | " + deck.getPlayerCard() + " | VS | "+ deck.getComputerCard()+ " |" );
            deck.realBattle();
            System.out.println(" ");
            System.out.println("your cards remaining: " + deck.getPlayerDeck().size()+"               "+ "computer cards reminng: "+ deck.getComputerDeck().size());

            System.out.println(deck.toString());

            if (deck.getPlayerDeck().size() == 0 || deck.getComputerDeck().size() == 0){
                scanner.nextLine();
                deck = new Deck();
                deck.shuffle();

                deck.split();
                //inGame = false;
            }
        }

    }
}