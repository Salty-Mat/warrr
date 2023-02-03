import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        boolean inGame = true;

        deck.shuffle();

        deck.split();

        //player char
        char Picon;
        char Pnum;
        String Pboth;
        //comp char
        char Cicon;
        char Cnum;
        String Cboth;

        while (inGame){

            System.out.println("           < PLAYER >          < CPU >  ");
            System.out.println("            ? ——— ?            ? ——— ? ");
            System.out.println("            |  ?  |            |  ?  | ");
            System.out.println("            ? ——— ?            ? ——— ? ");

            System.out.println("\n         Press Enter to flip card...");
            scanner.nextLine();

            deck.battle();
            Picon = deck.getPlayerCard().toString().charAt(2);
            Pnum = deck.getPlayerCard().toString().charAt(0);
            Pboth = deck.getPlayerCard().toString();

            Cicon = deck.getPlayerCard().toString().charAt(2);
            Cnum = deck.getPlayerCard().toString().charAt(0);
            Cboth = deck.getPlayerCard().toString();


            System.out.println("            "+Picon+" ——— "+Pnum+"            "+Cicon+" ——— "+Cnum+" ");
            System.out.println("            | "+ Pboth +" |  // VS //  | "+Cboth+" | ");
            System.out.println("            "+Pnum+" ——— "+Picon+"            "+Cnum+" ——— "+Cicon+" ");

            deck.realBattle();

            inGame = false;
        }


    }
}