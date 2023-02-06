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

        scanner.nextLine();

        while (inGame){




            System.out.println("           < PLAYER >          < CPU >  ");
//            System.out.println("            ? ——— ?            ? ——— ? ");
//            System.out.println("            |  ?  |            |  ?  | ");
//            System.out.println("            ? ——— ?            ? ——— ? \n");



//            System.out.println("\n...........Press Enter to flip card...........");
//            scanner.nextLine();

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            deck.battle();
            Picon = deck.getPlayerCard().toString().charAt(2);
            Pnum = deck.getPlayerCard().toString().charAt(0);
            Pboth = deck.getPlayerCard().toString();

            Cicon = deck.getComputerCard().toString().charAt(2);
            Cnum = deck.getComputerCard().toString().charAt(0);
            Cboth = deck.getComputerCard().toString();


            System.out.println("            "+Picon+" ——— "+Pnum+"            "+Cicon+" ——— "+Cnum+" ");
            System.out.println("            | "+ Pboth +" |  // VS //  | "+Cboth+" | ");
            System.out.println("            "+Pnum+" ——— "+Picon+"            "+Cnum+" ——— "+Cicon+"\n");

            System.out.println("                   --------------           \n");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



            int winner = deck.realBattle();

            if(winner == 0 ){
                System.out.println("            "+Picon+" ——— "+Pnum+"            "+Cicon+" ——— "+Cnum+" ");
                System.out.println("            | "+ Pboth +" |  WINNER >  | "+Cboth+" | ");
                System.out.println("            "+Pnum+" ——— "+Picon+"            "+Cnum+" ——— "+Cicon+" ");
            } else if(winner == 1){
                System.out.println("            "+Picon+" ——— "+Pnum+"            "+Cicon+" ——— "+Cnum+" ");
                System.out.println("            | "+ Pboth +" |  < WINNER  | "+Cboth+" | ");
                System.out.println("            "+Pnum+" ——— "+Picon+"            "+Cnum+" ——— "+Cicon+" ");
            } else {
                System.out.println("            "+Picon+" ——— "+Pnum+"            "+Cicon+" ——— "+Cnum+" ");
                System.out.println("            | "+ Pboth +" |  WARRRRRR  | "+Cboth+" | ");
                System.out.println("            "+Pnum+" ——— "+Picon+"            "+Cnum+" ——— "+Cicon+" ");
            }

            System.out.println("\n    Player cards: "+ deck.getPlayerDeck().size()+ "   computer cards: "+ deck.getComputerDeck().size() +"\n");

            System.out.println("------------------------------------------------");



//            System.out.println("\n         Press Enter clear table");
//            scanner.nextLine();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }






            if (deck.getPlayerDeck().size() == 0 || deck.getComputerDeck().size() == 0){
                inGame = false;
            }

        }


    }
}