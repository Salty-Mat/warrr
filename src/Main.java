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

        System.out.println("Do you want to play in auto mode? (Y/n):");
        String uhh = scanner.nextLine();
        //System.out.println(uhh);

        while (inGame) {

            deck.battle();

            Picon = deck.getPlayerCard().toString().charAt(2);
            Pnum = deck.getPlayerCard().toString().charAt(0);
            Pboth = deck.getPlayerCard().toString();

            Cicon = deck.getComputerCard().toString().charAt(2);
            Cnum = deck.getComputerCard().toString().charAt(0);
            Cboth = deck.getComputerCard().toString();

            System.out.println("           < PLAYER >          < CPU >  \n" + "            " + Picon + " ——— " + Pnum + "            " + Cicon + " ——— " + Cnum + " \n"+"            | " + Pboth + " |  // VS //  | " + Cboth + " | \n "+"           " + Pnum + " ——— " + Picon + "            " + Cnum + " ——— " + Cicon + "\n"+ "                   --------------           \n");
           // System.out.println("           < PLAYER >          < CPU >  ");
           //System.out.println("            " + Picon + " ——— " + Pnum + "            " + Cicon + " ——— " + Cnum + " ");
            //System.out.println("            | " + Pboth + " |  // VS //  | " + Cboth + " | ");
            //System.out.println("            " + Pnum + " ——— " + Picon + "            " + Cnum + " ——— " + Cicon + "\n");

            //System.out.println("                   --------------           \n");


            int winner = deck.realBattle();

            if (winner == 0) {
                    System.out.println("            " + Picon + " ——— " + Pnum + "            " + Cicon + " ——— " + Cnum + " \n" +"            | " + Pboth + " |  WINNER >  | " + Cboth + " | \n" + "            " + Pnum + " ——— " + Picon + "            " + Cnum + " ——— " + Cicon + " ");
                    //System.out.println("            " + Picon + " ——— " + Pnum + "            " + Cicon + " ——— " + Cnum + " ");
//                    System.out.println("            | " + Pboth + " |  WINNER >  | " + Cboth + " | ");
//                    System.out.println("            " + Pnum + " ——— " + Picon + "            " + Cnum + " ——— " + Cicon + " ");
            } else if (winner == 1) {
                System.out.println("            " + Picon + " ——— " + Pnum + "            " + Cicon + " ——— " + Cnum + " \n" + "            | " + Pboth + " |  < WINNER  | " + Cboth + " | \n" + "            " + Pnum + " ——— " + Picon + "            " + Cnum + " ——— " + Cicon + " ");
                //System.out.println("            " + Picon + " ——— " + Pnum + "            " + Cicon + " ——— " + Cnum + " ");
                //System.out.println("            | " + Pboth + " |  < WINNER  | " + Cboth + " | ");
                //System.out.println("            " + Pnum + " ——— " + Picon + "            " + Cnum + " ——— " + Cicon + " ");
            } else {
                System.out.println("            " + Picon + " ——— " + Pnum + "            " + Cicon + " ——— " + Cnum + " \n" + "            | " + Pboth + " |  WARRRRRR  | " + Cboth + " | \n" + "            " + Pnum + " ——— " + Picon + "            " + Cnum + " ——— " + Cicon + " ");

                //System.out.println("            " + Picon + " ——— " + Pnum + "            " + Cicon + " ——— " + Cnum + " ");
                //System.out.println("            | " + Pboth + " |  WARRRRRR  | " + Cboth + " | ");
                //System.out.println("            " + Pnum + " ——— " + Picon + "            " + Cnum + " ——— " + Cicon + " ");
            }

            System.out.println("\n    Player cards: " + deck.getPlayerDeck().size() + "   computer cards: " + deck.getComputerDeck().size() + "\n");


            if (uhh.equals("n") || uhh.equals("N")) {
                System.out.println("------------------Press Enter clear table------------------");
                scanner.nextLine();
            } else if (uhh.equals("y") || uhh.equals("Y")) {
                System.out.println("------------------------------------------------------------");

                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("--------------------------------------");

                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }



            if (deck.getPlayerDeck().size() == 0) {
                System.out.println("            🎉🎉  - COMPUTER WON - 🎉🎉");
                inGame = false;
            } else if (deck.getComputerDeck().size() == 0) {
                System.out.println("                🎉🎉  - PLAYER WON - 🎉🎉");
                inGame = false;
            }

            //            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }


        }

    }


}