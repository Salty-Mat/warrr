import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        boolean inGame = true;

        deck.shuffle();

        deck.split();

        while (inGame){
            System.out.println("           < PLAYER >          < CPU >  ");
            System.out.println("            ? ——— ?            ? ——— ? ");
            System.out.println("            |  ?  |            |  ?  | ");
            System.out.println("            ? ——— ?            ? ——— ? ");

            deck.battle();

            System.out.println("            ? ——— ?            ? ——— ? ");
            System.out.println("            | "+deck.getPlayerCard()+" |  // VS //  | "+deck.getComputerCard()+" | ");
            System.out.println("            ? ——— ?            ? ——— ? ");

            deck.realBattle();

            inGame = false;
        }


    }
}