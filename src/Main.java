//Elijah Chandler
//10/8/22
import java.util.Scanner;
public class Main {
    //the main method plays one game and asks for the user to input their name and will run the game after
    // the game finishes it asks if you want to play another
    public static void main(String[] args)
    {
        String choice = "Y";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        while(choice.equals("Y") || choice.equals("y") ) {
            Game one = new Game(name);
            one.playGame();
            System.out.println("would you like to play again? Enter Y/N");
            choice = sc.nextLine();
        }
    }
}