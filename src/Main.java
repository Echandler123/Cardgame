public class Main {
    public static void main(String[] args)
    {
        System.out.println("working");
        Game one = new Game("Elijah");
        String winner = one.playGame();
        System.out.println(winner);
    }
}