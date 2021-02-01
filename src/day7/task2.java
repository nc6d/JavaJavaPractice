package day7;

import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random rnd = new Random();


//        Judge judge = new Judge();


        Player player0 = new Player(rnd.nextInt(((100 - 90) + 1) + 90));
        Player player1 = new Player(rnd.nextInt(95));
        Player player2 = new Player(rnd.nextInt(((100 - 90) + 1) + 90));
        Player player3 = new Player(rnd.nextInt(((100 - 90) + 1) + 90));

        Player.info();

        Player player4 = new Player(rnd.nextInt(((100 - 90) + 1) + 90));
        Player player5 = new Player(rnd.nextInt(((100 - 90) + 1) + 90));
        Player.info();

        for (int i = 0; i < 95; i++)
            player1.run();
        Player.info();
    }
}

class Player {

    int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6){
            countPlayers++;

        }

    }

    public int getStamina() {
        return this.stamina;
    }

    public void run(){
        if (stamina == 0)
            return;
        stamina -= 1;

        if (stamina == 0)
            countPlayers--;

    }
    public static void info(){
        if (countPlayers < 6){
            if (countPlayers == 1)
                System.out.println("Teams are not full. There are " + (6 - countPlayers)+ " free place");
            System.out.println("Teams are not full. There are " + (6 - countPlayers)+ " free places");

        }
        else
            System.out.println("There are no free places in team.");
    }



}
//Experimental features
// TODO: 01.02.2021
/*
class Judge {

}*/
