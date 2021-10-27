import java.util.*;

/*
to do:
write code to terminate at 13
 */

public class runGame {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the player name and hit enter");
        String nam = s.nextLine();
        System.out.println("The game setup is ready");
        player player1 = new player(nam);
        player1.run();
    }
}







