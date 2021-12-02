import domain.Racing;

public class RacingGame {

    public static void main(String[] args) {
        Racing newGame = Racing.getInstance();
        newGame.play();
        newGame.printResult();
    }
}
