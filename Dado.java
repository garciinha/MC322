
import java.util.*;
import java.util.Random;

/**
 * 
 */
public abstract class Dado {

    /**
     * Default constructor
     */
    public Dado() {
    }
    /**
     * 
     */
    public int jogar() {
        Random lado = new Random();
        int valor = lado.nextInt(6) + 1;
        return valor;
    }

}
