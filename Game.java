
import java.util.*;

public class Game {
    private boolean exitSelected;

    public Game() {
    }
    public void start() {
        exit = false;
        System.out.println("Game started!");
        while(!exit) {
            drawBoard();
            lerInput();
            updateBoard();
        }
        System.out.println("Game terminated. Bye!");
    }

    public void lerInput() {

    }

}
